package io.github.haniyehkhaksar.clean_architecture.feature.movies.data

import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.movies.data.repository.MovieRepository
import io.github.haniyehkhaksar.clean_architecture.feature.movies.domain.repository.IMovieRepository
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

internal val dataModule = Kodein.Module("${FEATURE_NAME}DataModule") {

    bind<IMovieRepository>() with singleton { MovieRepository() }

}