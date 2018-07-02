package com.example.james.instagramapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.support.v7.app.AppCompatActivity
import com.example.james.instagramapp.Utils.BottomNavigationViewHelper
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


class ShareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: starting.")

        setupBottomNavigationView()
    }
    private fun setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView")
        val bottomNavigationViewEx = findViewById<View>(R.id.bottomNavViewBar) as BottomNavigationViewEx
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx)

    }

    companion object {

        private val TAG = "ShareActivity"
    }
}