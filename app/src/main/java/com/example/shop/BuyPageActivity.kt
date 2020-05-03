package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_buy_page.*
import kotlinx.android.synthetic.main.activity_complete_register.*

class BuyPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_page)
        var name = intent.getStringExtra("name")
        textView34.text = name
        val number = intent.getStringExtra("number")
        textView49.text = number
        val number1 = intent.getStringExtra("number1")
        textView46.text = number1
        val number2 = intent.getStringExtra("number2")
        textView44.text = number2
        val number3 = intent.getStringExtra("number3")
        textView47.text = number3
        val number4 = intent.getStringExtra("number4")
        textView43.text = number4
        val number5 = intent.getStringExtra("number5")
        textView45.text = number5
        val number6= intent.getStringExtra("number6")
        textView48.text = number6
        val number7 = intent.getStringExtra("number7")
        textView42.text = number7


        Map1.setOnClickListener {

            val intent = Intent(this,MapsActivity::class.java)
            startActivity(intent)
        }

        Back4.setOnClickListener {

            name = textView34.text.toString()
            val intent = Intent (this,ShopPageActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)

        }

    }
}
