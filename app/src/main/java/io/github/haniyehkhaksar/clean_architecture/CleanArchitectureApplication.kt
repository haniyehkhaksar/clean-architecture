package io.github.haniyehkhaksar.clean_architecture

import android.app.Application
import io.github.haniyehkhaksar.clean_architecture.feature.FeatureManager
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule

class CleanArchitectureApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@CleanArchitectureApplication))
        importAll(FeatureManager.kodeinModules)
    }
}