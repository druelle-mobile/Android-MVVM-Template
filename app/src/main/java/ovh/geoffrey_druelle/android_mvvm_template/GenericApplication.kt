package ovh.geoffrey_druelle.android_mvvm_template

import android.app.Application
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import com.facebook.stetho.Stetho
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ovh.geoffrey_druelle.android_mvvm_template.injection.getModules
import timber.log.Timber
import timber.log.Timber.DebugTree
import timber.log.Timber.d

class GenericApplication: Application() {

    companion object {
        lateinit var appContext: Context
        lateinit var instance: GenericApplication
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        instance = this

        if (!isRoboUnitTest() ||BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
            Stetho.initializeWithDefaults(appContext)
        }

        startKoin {
            androidContext(this@GenericApplication)
            modules(getModules())
        }
    }

    private fun isRoboUnitTest(): Boolean {
        return "robolectric" == Build.FINGERPRINT
    }

    fun getVersionName(): String {
        try {
            val packageInfo = this.packageManager.getPackageInfo(packageName, 0)
            return packageInfo.versionName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            d(e)
        }
        return "0.0.0"
    }
}