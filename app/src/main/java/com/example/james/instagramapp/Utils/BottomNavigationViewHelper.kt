package com.example.james.instagramapp.Utils

import android.content.Context
import android.util.Log

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx
import android.content.Intent
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import com.example.james.instagramapp.*


object BottomNavigationViewHelper {

    private val TAG = "BottomNavigationViewHel"

    fun setupBottomNavigationView(bottomNavigationViewEx: BottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView")
        bottomNavigationViewEx.enableAnimation(false)
        bottomNavigationViewEx.enableItemShiftingMode(false)
        bottomNavigationViewEx.enableShiftingMode(false)
        bottomNavigationViewEx.setTextVisibility(false)
    }

    fun enableNavigation(context: Context, view: BottomNavigationViewEx) {
        view.onNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.itemId) {

                    R.id.ic_house -> {
                        val intent1 = Intent(context, MainActivity::class.java)//ACTIVITY_NUM = 0
                        context.startActivity(intent1)
                    }

                    R.id.ic_search -> {
                        val intent2 = Intent(context, SearchActivity::class.java)//ACTIVITY_NUM = 1
                        context.startActivity(intent2)
                    }

                    R.id.ic_circle -> {
                        val intent3 = Intent(context, ShareActivity::class.java)//ACTIVITY_NUM = 2
                        context.startActivity(intent3)
                    }

                    R.id.ic_alert -> {
                        val intent4 = Intent(context, LikeActivity::class.java)//ACTIVITY_NUM = 3
                        context.startActivity(intent4)
                    }

                    R.id.ic_android -> {
                        val intent5 = Intent(context, ProfileActivity::class.java)//ACTIVITY_NUM = 4
                        context.startActivity(intent5)
                    }
                }


                return false
            }
        }
    }
}