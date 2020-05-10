package io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.ui

import androidx.fragment.app.Fragment
import io.github.haniyehkhaksar.clean_architecture.feature.KotlinViewModelProvider
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.ui.details.ContactDetailsViewModel
import io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.ui.list.ContactListViewModel
import org.kodein.di.Kodein
import org.kodein.di.android.x.AndroidLifecycleScope
import org.kodein.di.generic.bind
import org.kodein.di.generic.scoped
import org.kodein.di.generic.singleton


internal val presentationModule = Kodein.Module("${FEATURE_NAME}UiModule") {

    bind<ContactDetailsViewModel>() with scoped<Fragment>(AndroidLifecycleScope).singleton {
        KotlinViewModelProvider.of(context) { ContactDetailsViewModel() }
    }

    bind<ContactListViewModel>() with scoped<Fragment>(AndroidLifecycleScope).singleton {
        KotlinViewModelProvider.of(context) { ContactListViewModel() }
    }
}