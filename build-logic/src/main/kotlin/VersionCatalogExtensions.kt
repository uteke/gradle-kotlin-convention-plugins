@file:Suppress("UnstableApiUsage")

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType

internal val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal val VersionCatalog.versionKotlinCompiler: String
    get() = findVersionOrThrow("androidxKotlinCompiler")

internal val VersionCatalog.libDesugar: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("desugar")
internal val VersionCatalog.libAndroidxComposeBom: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidX-compose-bom")
internal val VersionCatalog.libAndroidxComposeCompiler: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidX-compose-compiler")
internal val VersionCatalog.libAndroidxComposeFoundation: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidX-compose-foundation")
internal val VersionCatalog.libAndroidxComposeMaterial3: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidX-compose-material3")
internal val VersionCatalog.libAndroidxComposeUiToolingPreview: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidX-compose-uiToolingPreview")
internal val VersionCatalog.libAndroidxComposeUiTooling: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidX-compose-uiTooling")
internal val VersionCatalog.libTestJunitApi: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-jUnit-api")
internal val VersionCatalog.libTestJunitEngine: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-jUnit-engine")
internal val VersionCatalog.libTestJunitParams: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-jUnit-params")
internal val VersionCatalog.libTestMockk: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-mockk")

private fun VersionCatalog.findLibraryOrThrow(name: String) =
    findLibrary(name)
        .orElseThrow { NoSuchElementException("Library $name not found in version catalog") }
private fun VersionCatalog.findVersionOrThrow(name: String) =
    findVersion(name)
        .orElseThrow { NoSuchElementException("Version $name not found in version catalog") }
        .requiredVersion
