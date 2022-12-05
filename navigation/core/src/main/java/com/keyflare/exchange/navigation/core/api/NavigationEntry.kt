package com.keyflare.exchange.navigation.core.api

class NavigationEntryId<P : NavigationParams, R : PushResult> private constructor(
    val id: Int,
) {
    override fun toString() = "ID[$id]"
    override fun equals(other: Any?) = other is NavigationEntryId<*, *> && other.id == id
    override fun hashCode() = id.hashCode()

    companion object {
        private var navigationEntryIdIncrement = 0

        fun <P : NavigationParams, R : PushResult> obtain() = NavigationEntryId<P, R>(
            id = navigationEntryIdIncrement++
        )
    }
}

abstract class NavigationEntry<P : NavigationParams, R : PushResult> {
    abstract val id: NavigationEntryId<P, R>
    open val params: P? = null
    open val pushForResultRequest: PushForResultRequest<R>? = null
}

interface PushResult {
    object None : PushResult
}

class PushForResultRequest<R : PushResult> private constructor(
    private val id: Int,
    val backstackId: BackstackId,
) {
    companion object {
        private var increment = 0

        fun <R : PushResult> obtain(
            backstackId: BackstackId,
        ): PushForResultRequest<R> = PushForResultRequest(increment++, backstackId)
    }
}
