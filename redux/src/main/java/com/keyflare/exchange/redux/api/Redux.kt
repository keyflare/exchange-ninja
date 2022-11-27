package com.keyflare.exchange.redux.api

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

interface State

interface Action

fun interface Reducer<S : State> {
    fun reduce(state: S, action: Action) : S
}

interface Middleware<S : State> {
    fun interfere(store: Store<S>, action: Action): Action
}

interface Dispatcher {
    fun dispatch(action: Action)
}

interface StateProvider<S : State> {
    val currentState: S
    val states: StateFlow<S>
}

open class Store<S : State>(
    initialState: S,
    middlewares: List<Middleware<S>>,
    private val reducer: Reducer<S>
) : Dispatcher, StateProvider<S> {
    private val _states = MutableStateFlow(initialState)
    override val states = _states.asStateFlow()

    override val currentState get() = states.value

    private val actions = MutableSharedFlow<Action>()

    @OptIn(DelicateCoroutinesApi::class)
    private val scope = CoroutineScope(newSingleThreadContext(name = "Redux Thread"))

    // Each new action goes through chain of middlewares, there it can be mapped to another action.
    // After that the result action consumed by the reducer.
    init {
        actions
            .onEach { action ->
                val actionAfterMiddleware = middlewares.fold(action) { next, middleware ->
                    middleware.interfere(this@Store, next)
                }
                _states.value = reducer.reduce(states.value, actionAfterMiddleware)
            }
            .launchIn(scope)

        scope.launch { actions.emit(InitialAction) }
    }

    override fun dispatch(action: Action) {
        scope.launch { actions.emit(action) }
    }

    object InitialAction : Action
}

abstract class SideEffect<S : State> {
    protected open val sideEffectScope: CoroutineScope? = null

    abstract fun onAction(store: Store<S>, action: Action)
    abstract fun onDestroy()

    internal fun destroy() {
        sideEffectScope?.cancel()
        onDestroy()
    }
}

open class SideEffectsMiddleware<S : State>(
    private val globalEffects: List<SideEffect<S>>
) : Middleware<S> {
    private val connectableEffectsMap = HashMap<Any, List<SideEffect<S>>>()

    fun connectSideEffects(key: Any, effects: List<SideEffect<S>>) {
        connectableEffectsMap[key] = effects
    }

    fun disconnectSideEffects(key: Any) {
        connectableEffectsMap[key]?.forEach { it.onDestroy() }
        connectableEffectsMap.remove(key)
    }

    override fun interfere(store: Store<S>, action: Action): Action {
        connectableEffectsMap.forEach { (_, sideEffectsList) ->
            sideEffectsList.forEach { it.onAction(store, action) }
        }
        globalEffects.forEach { it.onAction(store, action) }
        return action
    }
}
