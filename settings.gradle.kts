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

<<<<<<< HEAD
 sharoobini
rootProject.name = "Womens safety"

rootProject.name = "Home"
   main
include(":app")
 
=======
rootProject.name = "WomanSafetyApp"
include(":app")
>>>>>>> d197538 (Initial commit)
