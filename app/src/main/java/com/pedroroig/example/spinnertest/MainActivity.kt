package com.pedroroig.example.spinnertest

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (pbSuiviHome.visibility == View.VISIBLE) {
                Log.d(TAG, "hiding loader")
                pbSuiviHome.visibility = View.GONE
                button.text = "Show Spinner"
            } else {
                Log.d(TAG, "showing loader")
                pbSuiviHome.visibility = View.VISIBLE
                button.text = "Hide Spinner"
            }
        }


    }
}
