package com.test.omikuji_android_kt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_result.*
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {

    var r = Random.nextInt(7)

    val images = intArrayOf(
        R.drawable.daikitixxxhdpi,
        R.drawable.tyukitixxxhdpi,
        R.drawable.kitixxxhdpi,
        R.drawable.shokitixxxhdpi,
        R.drawable.suekitixxxhdpi,
        R.drawable.kyouxxxhdpi,
        R.drawable.daikyouxxxhdpi
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        iv.setImageResource(images[r])
        iv.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fall))
    }

    fun b1(v : View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
