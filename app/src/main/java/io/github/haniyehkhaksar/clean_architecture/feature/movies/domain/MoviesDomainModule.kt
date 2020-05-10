package io.github.haniyehkhaksar.clean_architecture.feature.movies.domain

import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.movies.domain.usecase.MovieDetailsUsecase
import io.github.haniyehkhaksar.clean_architecture.feature.movies.domain.usecase.MovieListUsecase
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

internal val domainModule = Kodein.Module("${FEATURE_NAME}DomainModule") {

    bind() from singleton { MovieDetailsUsecase() }

    bind() from singleton { MovieListUsecase() }
}