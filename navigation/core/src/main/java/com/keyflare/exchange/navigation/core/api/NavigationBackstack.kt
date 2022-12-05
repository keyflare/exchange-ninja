package com.keyflare.exchange.navigation.core.api

typealias BackstackId = NavigationEntryId<NavigationParams.None, PushResult.None>
typealias Screens = List<NavigationEntry<out NavigationParams, out PushResult>>

data class Backstack(
    override val id: BackstackId,
    val screens: Screens = emptyList()
) : NavigationEntry<NavigationParams.None, PushResult.None>() {

    companion object {
        fun obtainId() = NavigationEntryId.obtain<NavigationParams.None, PushResult.None>()
    }
}
