package io.github.haniyehkhaksar.clean_architecture.base.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.haniyehkhaksar.clean_architecture.base.ui.extension.toLiveData
import kotlin.properties.Delegates

abstract class BaseViewModel<ViewState : BaseViewState, ViewAction : BaseAction>(initialState: ViewState) :
    ViewModel() {
    private val stateMutableLiveData = MutableLiveData<ViewState>()
    val stateLiveData = stateMutableLiveData.toLiveData()

    protected var state by Delegates.observable(initialState) { _, old, new ->
        stateMutableLiveData.value = new
    }

    fun sendAction(viewAction: ViewAction) {
        state = onReduceState(viewAction)
    }

    fun loadData() {
        onLoadData()
    }

    protected open fun onLoadData() {}

    protected abstract fun onReduceState(viewAction: ViewAction): ViewState
}