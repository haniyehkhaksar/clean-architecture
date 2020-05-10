package io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.domain

import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.domain.usecase.ContactDetailsUsecase
import io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.domain.usecase.ContactListUsecase
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

internal val domainModule = Kodein.Module("${FEATURE_NAME}DomainModule") {

    bind() from singleton { ContactDetailsUsecase() }

    bind() from singleton { ContactListUsecase() }
}