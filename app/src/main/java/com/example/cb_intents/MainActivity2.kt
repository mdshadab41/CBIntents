package com.example.cb_intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val name = intent.getStringArrayExtra(KEY_1)
        val age = intent.getIntExtra(KEY_2, 0)
        val isStudent = intent.getBooleanExtra(KEY_3, false)
        textView.text = "$name $age $isStudent"
    }
}

