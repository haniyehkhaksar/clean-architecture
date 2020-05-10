package io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.ui

import androidx.fragment.app.Fragment
import io.github.haniyehkhaksar.clean_architecture.feature.KotlinViewModelProvider
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.ui.info.BluetoothInfoViewModel
import org.kodein.di.Kodein
import org.kodein.di.android.x.AndroidLifecycleScope
import org.kodein.di.generic.bind
import org.kodein.di.generic.scoped
import org.kodein.di.generic.singleton


internal val presentationModule = Kodein.Module("${FEATURE_NAME}UiModule") {

    bind<BluetoothInfoViewModel>() with scoped<Fragment>(AndroidLifecycleScope).singleton {
        KotlinViewModelProvider.of(context) { BluetoothInfoViewModel() }
    }
}