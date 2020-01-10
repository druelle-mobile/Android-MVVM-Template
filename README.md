# Android MVVM Template

This repository is made to have a personal template for my MVVM Android projects.

## Conception

### Gradle build and dependencies

Everything has been separated.

For the application global build, informations (definitions and versions) are localized in `app_build.gradle`.

About the dependencies definitions and versions, all is defined in `dependencies.gradle`.

### app_build.gradle

* **versionCode** is based on the date, with the following format : `yyMMddHHmm`
* **versionName** is based on a system of major, minor and patch/fix versions. Just increment the corresponding version depending of the work done.
* **SDK versions** are actually the following :
    * **Compile SDK** : 29
    * **Min SDK** : 23
    * **Target SDK** : 29
    * **Build tools** : 29.0.2
* **Gradle build version** is 3.5.3
* **Repositories** are defined in this file too. Just add needed ones in `addRepos(..)`. 

### dependencies.gradle

All dependencies are grouped by category. Categories are totally subjective.

* Support and Android basis
    * AppCompat
    * Core KTX
    * Preference
    * Material
    * Legacy support v4
    * Constraint Layout
    * GSON
* Kotlin
    * Gradle plugin
    * Stdlib
    * Coroutines core
    * Coroutines android
* Android Architecture Components
    * Navigation : ui & fragment
    * Room : runtime, compiler, KTX
    * Lifecycle : extensions
* Retrofit : runtime & GSON
* Koin : core, android, viewModel & test
* Picasso
* SSP and SDP (useful libraries for universal and adaptives XML sizes : dp and sp) 
* EasyPermissions
* Timber
* Stetho
* Tests
    * Koin
    * JUnit
    * Espresso