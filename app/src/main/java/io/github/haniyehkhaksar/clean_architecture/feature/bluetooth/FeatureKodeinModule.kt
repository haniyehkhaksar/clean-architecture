package io.github.haniyehkhaksar.clean_architecture.feature.bluetooth

import io.github.haniyehkhaksar.clean_architecture.feature.KodeinModuleProvider
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.data.dataModule
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.domain.domainModule
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.ui.presentationModule
import org.kodein.di.Kodein

internal const val FEATURE_NAME = "Bluetooth"

object FeatureKodeinModule : KodeinModuleProvider {

    override val kodeinModule = Kodein.Module("${FEATURE_NAME}Module") {
        import(presentationModule)
        import(domainModule)
        import(dataModule)
    }
}