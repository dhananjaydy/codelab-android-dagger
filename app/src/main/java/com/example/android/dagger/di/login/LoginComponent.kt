package com.example.android.dagger.di.login

import com.example.android.dagger.di.base.ViewModelFactoryModule
import com.example.android.dagger.di.base.ActivityScope
import com.example.android.dagger.login.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(
    modules = [
        LoginViewModelModule::class,
        ViewModelFactoryModule::class
    ]
)
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}