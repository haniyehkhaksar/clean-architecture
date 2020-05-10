package io.github.haniyehkhaksar.clean_architecture.feature

object FeatureManager {

    private const val featurePackagePrefix = "io.github.haniyehkhaksar.clean_architecture.feature"

    val kodeinModules = listOf("bluetooth", "favcontacts", "movies")
        .map { "$featurePackagePrefix.$it.FeatureKodeinModule" }
        .map {
            try {
                Class.forName(it).kotlin.objectInstance as KodeinModuleProvider
            } catch (e: ClassNotFoundException) {
                throw ClassNotFoundException("Kodein module class not found $it")
            }
        }
        .map { it.kodeinModule }
}
