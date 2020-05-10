package io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.ui.info

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R
import io.github.haniyehkhaksar.clean_architecture.base.ui.fragment.BaseFragment

class BluetoothInfoFragment : BaseFragment() {

    companion object {
        fun newInstance() = BluetoothInfoFragment()
    }

    private lateinit var viewModel: BluetoothInfoViewModel
    override val layoutResourceId: Int
        get() = R.layout.bluetooth_info_fragment

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BluetoothInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
