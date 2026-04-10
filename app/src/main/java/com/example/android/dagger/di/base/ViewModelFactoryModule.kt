package com.example.android.dagger.di.base

import androidx.lifecycle.ViewModelProvider
import com.example.android.dagger.di.base.DaggerViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(
        factory: DaggerViewModelFactory
    ): ViewModelProvider.Factory

}