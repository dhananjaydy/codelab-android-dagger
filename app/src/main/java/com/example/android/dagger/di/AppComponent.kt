package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.di.base.ViewModelFactoryModule
import com.example.android.dagger.di.login.LoginComponent
import com.example.android.dagger.di.registration.RegistrationComponent
import com.example.android.dagger.di.splash.SplashViewModelModule
import com.example.android.dagger.di.storage.StorageModule
import com.example.android.dagger.splash.SplashActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        StorageModule::class,
        AppSubcomponents::class,
        SplashViewModelModule::class,
        ViewModelFactoryModule::class
    ]
)
@Singleton
interface AppComponent {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance context: Context): AppComponent
    }

    fun loginComponent(): LoginComponent.Factory
    fun registrationComponent(): RegistrationComponent.Factory
    fun userManager(): UserManager
    fun inject(activity: SplashActivity)

}