package com.example.mylab03_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mylab03_apps.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_upper_menu.*

class ActivityUpperButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upper_menu)

        //Get data from first activity
        var intent_2nd = intent
        val name_2nd = intent.getStringExtra("name")

        //Show the name
        name_View.text = name_2nd

    }

    /**
     * Execute an exit button and finishes second activity
     */
    fun exitUpperButton(view: View){  finish() }


}