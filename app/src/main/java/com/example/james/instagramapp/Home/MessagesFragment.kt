package com.example.james.instagramapp.Home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.james.instagramapp.R


/**
 * Created by User on 5/28/2017.
 */

class MessagesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_messages, container, false)
    }

    companion object {
        private val TAG = "MessagesFragment"
    }
}