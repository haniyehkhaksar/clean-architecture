package io.github.haniyehkhaksar.clean_architecture.feature.movies.ui

import androidx.fragment.app.Fragment
import io.github.haniyehkhaksar.clean_architecture.feature.KotlinViewModelProvider
import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.movies.ui.details.MovieDetailsViewModel
import io.github.haniyehkhaksar.clean_architecture.feature.movies.ui.list.MovieListViewModel
import org.kodein.di.Kodein
import org.kodein.di.android.x.AndroidLifecycleScope
import org.kodein.di.generic.bind
import org.kodein.di.generic.scoped
import org.kodein.di.generic.singleton


internal val presentationModule = Kodein.Module("${FEATURE_NAME}UiModule") {

    bind<MovieDetailsViewModel>() with scoped<Fragment>(AndroidLifecycleScope).singleton {
        KotlinViewModelProvider.of(context) { MovieDetailsViewModel() }
    }

    bind<MovieListViewModel>() with scoped<Fragment>(AndroidLifecycleScope).singleton {
        KotlinViewModelProvider.of(context) { MovieListViewModel() }
    }
}