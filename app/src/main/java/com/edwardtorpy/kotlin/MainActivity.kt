package com.edwardtorpy.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /*fun toastMe(view: View) {
        Toast.makeText(this, "This is a toast!!", Toast.LENGTH_SHORT).show()
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }
}
