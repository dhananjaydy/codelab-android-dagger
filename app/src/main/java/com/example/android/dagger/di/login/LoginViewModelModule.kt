package com.example.android.dagger.di.login

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.base.ViewModelKey
import com.example.android.dagger.login.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class LoginViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(loginViewModel: LoginViewModel): ViewModel

}