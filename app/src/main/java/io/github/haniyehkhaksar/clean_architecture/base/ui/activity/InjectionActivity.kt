package io.github.haniyehkhaksar.clean_architecture.base.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import io.github.haniyehkhaksar.clean_architecture.BuildConfig
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.KodeinTrigger
import org.kodein.di.android.kodein
import org.kodein.di.android.retainedKodein
import org.kodein.di.generic.kcontext

abstract class InjectionActivity : AppCompatActivity(), KodeinAware {

    private val parentKodein by kodein()

    @SuppressWarnings("LeakingThisInConstructor")
    final override val kodeinContext = kcontext<AppCompatActivity>(this)

    final override val kodein: Kodein by retainedKodein {
        extend(parentKodein)
    }
    final override val kodeinTrigger: KodeinTrigger?
        get() = if (BuildConfig.DEBUG) KodeinTrigger() else super.kodeinTrigger

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        kodeinTrigger?.trigger()
    }
}