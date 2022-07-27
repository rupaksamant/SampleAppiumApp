package com.spireon.sampleappiumapp.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.spireon.sampleappiumapp.databinding.ActivitySplashBinding
import com.spireon.sampleappiumapp.databinding.ActivityWelcomeBinding
import com.spireon.sampleappiumapp.ui.login.LoginActivity

class WelcomeActivity: AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.welcomeSignIn.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}