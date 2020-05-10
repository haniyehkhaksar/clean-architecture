package io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.data

import io.github.haniyehkhaksar.clean_architecture.feature.bluetooth.FEATURE_NAME
import io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.data.repository.ContactRepository
import io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.domain.repository.IContactRepository
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

internal val dataModule = Kodein.Module("${FEATURE_NAME}DataModule") {

    bind<IContactRepository>() with singleton { ContactRepository() }

}