package com.example.james.instagramapp.Profile


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.view.View
import com.example.james.instagramapp.R

import com.example.james.instagramapp.Utils.BottomNavigationViewHelper
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


class ProfileActivity : AppCompatActivity() {

    private val mContext = this@ProfileActivity

    override fun onCreate( savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Log.d(TAG, "onCreate: started.")

        setupBottomNavigationView();
        setupToolbar()
    }

    private fun setupToolbar() {
        val toolbar = findViewById<View>(R.id.profileToolBar) as Toolbar
        setSupportActionBar(toolbar)

        toolbar.setOnMenuItemClickListener { item ->
            Log.d(TAG, "onMenuItemClick: clicked menu item: $item")

            when (item.itemId) {
                R.id.profileMenu -> Log.d(TAG, "onMenuItemClick: Navigating to Profile Preferences.")
            }

            false
        }
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return true
    }

    companion object {
        private val TAG = "ProfileActivity"
        private val ACTIVITY_NUM = 4
    }
}