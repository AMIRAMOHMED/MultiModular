sealed class Build {
    open val isMinifyEnabled = false
    open val isDebuggable = false
    open val applicationIdSuffix = ""
    open val versionNameSuffix = ""
    open val enableUnitTestCoverage = false

    object Debug : Build() {
        override val isMinifyEnabled = false
        override val isDebuggable = true
        override val enableUnitTestCoverage = true
        override val applicationIdSuffix = ".debug"
        override val versionNameSuffix = "-debug"
    }
    object Release : Build() {
        override val isMinifyEnabled = true
        override val isDebuggable = false
        override val enableUnitTestCoverage = false
    }
    object ReleaseExternalQa : Build() {
        override val isMinifyEnabled = false
        override val isDebuggable = false
        override val enableUnitTestCoverage = true
        override val applicationIdSuffix = ".QA"
        override val versionNameSuffix = "-externalQa"
    }
}