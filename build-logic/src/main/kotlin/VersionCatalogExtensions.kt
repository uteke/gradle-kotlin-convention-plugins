@file:Suppress("UnstableApiUsage")

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByType

internal val Project.libs: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

internal val VersionCatalog.androidxCore: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("androidX-coreKtx")
internal val VersionCatalog.kotlinCompilerVersion: String
    get() = findVersionOrThrow("androidxKotlinCompilerExtensionVersion")
internal val VersionCatalog.testJunitApi: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-jUnit-api")
internal val VersionCatalog.testJunitEngine: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-jUnit-engine")
internal val VersionCatalog.testJunitParams: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-jUnit-params")
internal val VersionCatalog.testMockitoCore: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-mockito-core")
internal val VersionCatalog.testMockitoJunit: Provider<MinimalExternalModuleDependency>
    get() = findLibraryOrThrow("test-mockito-junit")

private fun VersionCatalog.findLibraryOrThrow(alias: String) =
    findDependency(alias)
        .orElseThrow { NoSuchElementException("Library $alias not found in version catalog") }
private fun VersionCatalog.findVersionOrThrow(name: String) =
    findVersion("androidxKotlinCompilerExtensionVersion")
        .orElseThrow { NoSuchElementException("Version $name not found in version catalog") }
        .requiredVersion
