package io.github.haniyehkhaksar.clean_architecture.base.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

abstract class BaseFragment : InjectionFragment() {

    @get:LayoutRes
    protected abstract val layoutResourceId: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(layoutResourceId, null)
}