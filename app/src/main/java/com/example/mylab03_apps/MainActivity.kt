/**
 * @author Oliver Josué de león Milian
 */

package com.example.mylab03_apps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import com.example.mylab03_apps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Declares data Binding
    lateinit var mBinding: ActivityMainBinding
    //Attributes
    lateinit var editText: EditText
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Data Binding
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //Declaring
        editText = findViewById(R.id.editText)

    }
    /**
     * Upper button starts a second activity
     */
    fun upperButton(view: View){

        //Get String value from editText
        name = editText.text.toString()

        //Start second activity
        val intent = Intent(this, ActivityUpperButton::class.java)
        intent.putExtra("name", name)
        startActivity(intent)

    }





}

