pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

<<<<<<< Updated upstream
=======
HEAD
 sharoobini
rootProject.name = "Womens safety"

rootProject.name = "Home"
   main
include(":app")

>>>>>>> Stashed changes
rootProject.name = "WomanSafetyApp"
include(":app")
