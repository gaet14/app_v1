package com.example.app_v1.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.app_v1.R
import com.example.app_v1.ui.home.Home

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // permet de changer l'activité splash à main apres 1000 ms
        Handler(Looper.getMainLooper()).postDelayed({
            // permet de lancer l'activity MainActivity
            startActivity(Home.getStartIntent(this))
            finish() // permet d'éviter que startActivity reste sur la stack de navigation (en gros pour éviter des prendre la rame)
        }, 1000)
    }
}