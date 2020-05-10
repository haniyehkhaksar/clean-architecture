package io.github.haniyehkhaksar.clean_architecture.feature.movies.ui.details

import io.github.haniyehkhaksar.clean_architecture.base.ui.viewmodel.BaseAction
import io.github.haniyehkhaksar.clean_architecture.base.ui.viewmodel.BaseViewModel
import io.github.haniyehkhaksar.clean_architecture.base.ui.viewmodel.BaseViewState

internal class MovieDetailsViewModel :
    BaseViewModel<MovieDetailsViewModel.ViewState, MovieDetailsViewModel.Action>(ViewState()) {

    override fun onReduceState(viewAction: Action): ViewState {
        TODO("Not yet implemented")
    }

    internal data class ViewState(val forNow: String = "") : BaseViewState

    internal sealed class Action : BaseAction

}
