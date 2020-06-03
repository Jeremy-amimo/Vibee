package com.example.vibee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_)

        handler = Handler()
        handler.postDelayed({

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}
