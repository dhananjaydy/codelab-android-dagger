package com.example.android.dagger.di.registration

import androidx.lifecycle.ViewModel
import com.example.android.dagger.di.base.ViewModelKey
import com.example.android.dagger.registration.RegistrationViewModel
import com.example.android.dagger.registration.enterdetails.EnterDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class RegistrationViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(RegistrationViewModel::class)
    abstract fun bindRegistrationViewModel(registrationViewModel: RegistrationViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(EnterDetailsViewModel::class)
    abstract fun bindEnterDetailsViewModel(
        enterDetailsViewModel: EnterDetailsViewModel
    ): ViewModel

}