package com.example.synrgy_codechallenge3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class LandigPageLoad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landig_page_load)
        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {}

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameMain, LandingPage1())
            .commit()
    }

    fun keHalamanFragment2(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameMain, LandingPage2())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }

    fun keHalamanFragment3(){
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameMain, LandingPage3())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }
}