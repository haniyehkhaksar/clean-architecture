package io.github.haniyehkhaksar.clean_architecture.feature

import org.kodein.di.Kodein

interface KodeinModuleProvider {

    val kodeinModule: Kodein.Module
}
