package com.example.musiccleanarchitecture.app.feature.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.miquinielamx.module.feature_tools.context.navigateToActivityClearTop
import com.example.musiccleanarchitecture.R
import com.example.musiccleanarchitecture.app.feature.main.MainActivity
import com.example.musiccleanarchitecture.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    /* ViewBinding instance associated to the current screen */
    private val binding by lazy { ActivitySplashBinding.inflate(layoutInflater) }

    /*****************************************************************************************
     * LIFECYCLE
     ****************************************************************************************/

    /** Called at create the screen. */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        executeSplashActivity()
    }

    /** Run splash. */
    private fun executeSplashActivity() {
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            navigateToActivityClearTop(MainActivity::class.java)
        }, 3000)
    }

}