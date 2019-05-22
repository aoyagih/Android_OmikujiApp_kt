package com.test.omikuji_android_kt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun b0(v: View) {
        findViewById<ImageButton>(R.id.omikuji).startAnimation(AnimationUtils.loadAnimation(this, R.anim.shake_omikuji))
        val intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
    }

}
