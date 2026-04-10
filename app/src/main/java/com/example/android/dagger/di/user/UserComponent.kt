package com.example.android.dagger.di.user

import com.example.android.dagger.di.base.ViewModelFactoryModule
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

@Subcomponent(
    modules = [
        UserViewModelModule::class,
        ViewModelFactoryModule::class
    ]
)
@LoggedUserScope
abstract class UserComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    abstract fun inject(activity: MainActivity)
    abstract fun inject(activity: SettingsActivity)

}