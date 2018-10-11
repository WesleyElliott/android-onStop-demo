package com.example.elliottw.bugtest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

private const val TAG = "THIRD_ACTIVITY"

class ThirdActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_2)
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "[ThirdActivity] onStop")
    }
}