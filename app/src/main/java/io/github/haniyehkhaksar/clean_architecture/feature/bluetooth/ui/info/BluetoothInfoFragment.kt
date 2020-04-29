package io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R

class BluetoothInfoFragment : Fragment() {

    companion object {
        fun newInstance() = BluetoothInfoFragment()
    }

    private lateinit var viewModel: BluetoothInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bluetooth_info_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BluetoothInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
