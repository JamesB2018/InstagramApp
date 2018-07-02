package com.example.james.instagramapp.Utils

import android.util.Log

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx



object BottomNavigationViewHelper {

    private val TAG = "BottomNavigationViewHel"

    fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView")
        bottomNavigationViewEx.enableAnimation(false)
        bottomNavigationViewEx.enableItemShiftingMode(false)
        bottomNavigationViewEx.enableShiftingMode(false)
        bottomNavigationViewEx.setTextVisibility(false)
    }
}