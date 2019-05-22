package com.test.omikuji_android_kt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import java.util.*

class ResultActivity : AppCompatActivity() {

    internal var images = intArrayOf(
        R.drawable.daikitixxxhdpi,
        R.drawable.tyukitixxxhdpi,
        R.drawable.kitixxxhdpi,
        R.drawable.shokitixxxhdpi,
        R.drawable.suekitixxxhdpi,
        R.drawable.kyouxxxhdpi,
        R.drawable.daikyouxxxhdpi
    )

    internal var r = Random()
    internal var n = r.nextInt(7)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        findViewById<ImageView>(R.id.imageView).setImageResource(images[n])
        findViewById<ImageView>(R.id.imageView).startAnimation(AnimationUtils.loadAnimation(this, R.anim.fall))
    }

    fun b1(v : View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
