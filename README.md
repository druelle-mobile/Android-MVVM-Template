# Android MVVM Template

This repository is made to have a personal template for my MVVM Android projects.

## Conception

### Architecture

This MVVM pattern is based on :

* a generic Application file
* a *core* folder for **base files** used for Dao, Fragments and ViewModel
* a *data* folder containing :
    * *local* folder containing :
        * *converter* folder for different converters (dates, boolean to integer...)
        * *dao* folder to contain our different DAO
        * *database* folder with the database file
        * *model* folder for all our local objects
    * *remote* folder containing :
        * *api* folder with api interfaces for Retrofit requests
        * *model* folder for objects based on a JSON for example
    * *repository* folder
* an *injection* folder with `AppModules.kt` used for **Koin's injections**
* an *ui* folder containing :
    * `MainActivity.kt`
    * folders for different views, composed by a combination of fragments & viewmodels (keeping the business logic and the view associated)
* an *utils* folder containing :
    * *extensions* folder for Kotlin extensions files
    * `Constants.kt` with constants used in the project
    * and other folders like *databinding*, etc

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
    * Room : runtime, compiler, KTX, RxJava2
    * Lifecycle : extensions
* Retrofit : runtime & GSON
* Koin : core, android, viewModel & test
* RxJava2 & RxAndroid
* Picasso
* SSP and SDP (useful libraries for universal and adaptives XML sizes : dp and sp) 
* EasyPermissions
* Timber
* Stetho
* Tests
    * Koin
    * JUnit
    * Espresso
    * Robolectric