package com.example.james.instagramapp


import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View

import com.example.james.instagramapp.Utils.BottomNavigationViewHelper
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


class ProfileActivity : AppCompatActivity() {

    private val mContext = this@ProfileActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: started.")

        setupBottomNavigationView()
    }

    /**
     * BottomNavigationView setup
     */
    private fun setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView")
        val bottomNavigationViewEx = findViewById<View>(R.id.bottomNavViewBar) as BottomNavigationViewEx
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx)
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx)
        val menu = bottomNavigationViewEx.menu
        val menuItem = menu.getItem(ACTIVITY_NUM)
        menuItem.isChecked = true
    }

    companion object {
        private val TAG = "ProfileActivity"
        private val ACTIVITY_NUM = 4
    }
}