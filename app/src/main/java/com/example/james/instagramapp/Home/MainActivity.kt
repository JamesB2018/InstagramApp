package com.example.james.instagramapp.Home


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.util.Log
import android.view.View
import com.example.james.instagramapp.R
import com.example.james.instagramapp.Utils.BottomNavigationViewHelper
import com.example.james.instagramapp.Utils.BottomNavigationViewHelper.setupBottomNavigationView

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: starting.")

        setupBottomNavigationView()
        setupViewPager()
    }

    private fun setupViewPager() {
        val adapter = SectionsPagerAdapter(supportFragmentManager)
        adapter.addFragment(CameraFragment()) //index 0
        adapter.addFragment(MainFragment()) //index 1
        adapter.addFragment(MessagesFragment()) //index 2
        val viewPager = findViewById<ViewPager>(R.id.container)
        viewPager.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tabs)
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)!!.setIcon(R.drawable.ic_camera)
        tabLayout.getTabAt(1)!!.setIcon(R.drawable.ic_action_name)
        tabLayout.getTabAt(2)!!.setIcon(R.drawable.ic_arrow)

    }
        /**
     * BottomNavigationView setup
     */
    private fun setupBottomNavigationView() {
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView")
        val bottomNavigationViewEx = findViewById<View>(R.id.bottomNavViewBar) as BottomNavigationViewEx
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx)
    }


}
