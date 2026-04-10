package com.example.android.dagger.splash// SplashViewModel.kt
import androidx.lifecycle.ViewModel
import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val userManager: UserManager
) : ViewModel() {

    enum class NextScreen {
        MAIN, LOGIN, REGISTRATION
    }

    fun getNextScreen(): NextScreen {
        return when {
            !userManager.isUserRegistered() -> NextScreen.REGISTRATION
            !userManager.isUserLoggedIn() -> NextScreen.LOGIN
            else -> NextScreen.MAIN
        }
    }
}