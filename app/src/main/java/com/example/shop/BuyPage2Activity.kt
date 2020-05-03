package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buy_page.*
import kotlinx.android.synthetic.main.activity_buy_page2.*
import kotlinx.android.synthetic.main.activity_rice_page.*

class BuyPage2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_page2)
        var name = intent.getStringExtra("name")
        textView33.text = name
        val number = intent.getStringExtra("number")
        textView35.text = number
        val number1 = intent.getStringExtra("number1")
        textView36.text = number1
        val number2 = intent.getStringExtra("number2")
        textView37.text = number2
        val number3 = intent.getStringExtra("number3")
        textView38.text = number3
        val number4 = intent.getStringExtra("number4")
        textView39.text = number4
        val number5 = intent.getStringExtra("number5")
        textView40.text = number5

        Map2.setOnClickListener {

            val intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }

        Back3.setOnClickListener {

            name = textView33.text.toString()
            val intent = Intent (this,RicePageActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}
