package com.example.android.dagger.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.android.dagger.MyApplication
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import javax.inject.Inject

// SplashActivity.kt
class SplashActivity : AppCompatActivity() {

    private lateinit var splashViewModel: SplashViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        // Inject using the global AppComponent
        (application as MyApplication).appComponent.inject(this)

        super.onCreate(savedInstanceState)
        splashViewModel = ViewModelProvider(
            this,
            viewModelFactory
        )[SplashViewModel::class.java]

        val intent = when (splashViewModel.getNextScreen()) {
            SplashViewModel.NextScreen.MAIN -> Intent(this, MainActivity::class.java)
            SplashViewModel.NextScreen.LOGIN -> Intent(this, LoginActivity::class.java)
            SplashViewModel.NextScreen.REGISTRATION -> Intent(this, RegistrationActivity::class.java)
        }

        startActivity(intent)
        finish()
    }
}