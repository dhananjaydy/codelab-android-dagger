package com.example.android.dagger.di.splash

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.base.ViewModelKey
import com.example.android.dagger.splash.SplashViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SplashViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashViewModel(splashViewModel: SplashViewModel): ViewModel

}