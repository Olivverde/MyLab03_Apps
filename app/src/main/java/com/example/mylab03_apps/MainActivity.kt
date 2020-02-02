package com.example.mylab03_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.mylab03_apps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Data Binding
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mBinding.main
        mBinding.upperButton.setOnClickListener(){
            fun upperButton(view: View){startActivity(Intent(this, ActivityUpperButton::class.java))}
        }
    }
}
