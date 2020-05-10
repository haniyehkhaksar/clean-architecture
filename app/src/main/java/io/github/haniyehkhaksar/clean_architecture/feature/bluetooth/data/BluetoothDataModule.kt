package io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.data

import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.data.repository.BluetoothRepository
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.domain.repository.IBluetoothRepository
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

internal val dataModule = Kodein.Module("${FEATURE_NAME}DataModule") {

    bind<IBluetoothRepository>() with singleton { BluetoothRepository() }

}