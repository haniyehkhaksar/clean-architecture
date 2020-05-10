package io.github.haniyehkhaksar.clean_architecture.feature.movies

import io.github.haniyehkhaksar.clean_architecture.feature.KodeinModuleProvider
import io.github.haniyehkhaksar.clean_architecture.feature.movies.data.dataModule
import io.github.haniyehkhaksar.clean_architecture.feature.movies.domain.domainModule
import io.github.haniyehkhaksar.clean_architecture.feature.movies.ui.presentationModule
import org.kodein.di.Kodein

internal const val FEATURE_NAME = "Contacts"

object FeatureKodeinModule : KodeinModuleProvider {

    override val kodeinModule = Kodein.Module("${FEATURE_NAME}Module") {
        import(presentationModule)
        import(domainModule)
        import(dataModule)
    }
}