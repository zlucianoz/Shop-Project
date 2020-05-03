package com.example.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_complete_register.*

class CompleteRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_register)
        val name = intent.getStringExtra("name")
        textView4.text = name
        val number =intent.getStringExtra("number")
        textView5.text = number

    }
}
