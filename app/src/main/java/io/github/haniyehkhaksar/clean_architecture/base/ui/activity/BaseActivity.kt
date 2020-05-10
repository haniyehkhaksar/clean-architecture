package io.github.haniyehkhaksar.clean_architecture.base.ui.activity

import android.os.Bundle
import android.view.WindowManager
import androidx.annotation.LayoutRes

abstract class BaseActivity : InjectionActivity() {

    @get:LayoutRes
    protected abstract val layoutResId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layoutResId)

        supportActionBar?.hide()

        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)

    }
}