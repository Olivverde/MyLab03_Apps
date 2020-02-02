package com.example.mylab03_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mylab03_apps.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class ActivityUpperButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upper_menu)


    }
}