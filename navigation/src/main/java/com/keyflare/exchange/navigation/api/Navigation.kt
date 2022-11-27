package com.keyflare.exchange.navigation.api

import com.keyflare.exchange.navigation.internal.ReduxNavigatorImpl
import com.keyflare.exchange.navigation.internal.navigationReducerInternal
import com.keyflare.exchange.redux.api.State
import com.keyflare.exchange.redux.api.Store
import kotlinx.coroutines.flow.Flow

data class NavigationState(
    val root: Backstack,
    val pushForResultMap: Map<PushForResultRequest<*>, PushResult>,
) : State

interface NavigationParams {
    object None : NavigationParams
}

private var navigationEntryIdIncrement = 0

interface NavigationEntryId<P : NavigationParams> {
    val id: Int

    companion object {
        fun <P : NavigationParams> obtain() = object : NavigationEntryId<P> {
            override val id: Int = navigationEntryIdIncrement++
        }
    }
}

interface NavigationEntryWithResultId<P : NavigationParams, R : PushResult> : NavigationEntryId<P> {

    companion object {
        fun <P : NavigationParams, R : PushResult> obtain() =
            object : NavigationEntryWithResultId<P, R> {
                override val id: Int = navigationEntryIdIncrement++
            }
    }
}

interface NavigationEntry<P : NavigationParams> {
    val id: NavigationEntryId<P>
    val params: P
}

abstract class NavigationEntryWithResult<P : NavigationParams, R : PushResult>(
    val pushForResultRequest: PushForResultRequest<R>? = null
) : NavigationEntry<P>

typealias BackstackId = NavigationEntryId<NavigationParams.None>

class Backstack(
    override val id: BackstackId,
) : NavigationEntry<NavigationParams.None> {
    override val params = NavigationParams.None

    val screens: List<NavigationEntry<*>> = emptyList()

    override fun equals(other: Any?) = other is Backstack && other.id == id
    override fun hashCode() = id.hashCode()
}

class PushForResultRequest<R : PushResult> private constructor(
    private val id: Int,
    internal val backstack: BackstackId,
) {
    companion object {
        private var increment = 0

        fun <R : PushResult> obtain(
            backstack: BackstackId,
        ): PushForResultRequest<R> = PushForResultRequest(increment++, backstack)
    }
}

interface PushResult

val navigationReducer = navigationReducerInternal

interface ReduxNavigator {
    fun <P : NavigationParams> push(
        backstack: BackstackId,
        destination: NavigationEntryId<P>,
        params: P,
    )

    fun push(
        backstack: BackstackId,
        destination: NavigationEntryId<NavigationParams.None>,
    )

    fun pop(backstack: BackstackId)

    fun <P : NavigationParams, R : PushResult> pushForResult(
        request: PushForResultRequest<R>,
        destination: NavigationEntryWithResultId<P, R>,
        params: P,
    ): Flow<PushResult>

    fun <R : PushResult> popWithResult(
        request: PushForResultRequest<R>,
        result: R,
    )

    companion object {
        operator fun invoke(
            store: Store<out NavigationState>,
        ): ReduxNavigator = ReduxNavigatorImpl()
    }
}
