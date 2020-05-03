package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rice_page.*

class RicePageActivity : AppCompatActivity() {

    var name : String = ""
    var number : String = ""
    var number1 : String = ""
    var number2 : String = ""
    var number3 : String = ""
    var number4 : String = ""
    var number5 : String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rice_page)
        var name = intent.getStringExtra("name")
        textView26.text = name


        Back2.setOnClickListener {

            name = textView26.text.toString()
            val intent = Intent (this,ShopPageActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }

        Buy2.setOnClickListener {

            name = textView26.text.toString()
            number = rice.text.toString()
            number1 = rice1.text.toString()
            number2 = rice2.text.toString()
            number3 = rice3.text.toString()
            number4 = rice4.text.toString()
            number5 = rice5.text.toString()
            val intent = Intent(this,BuyPage2Activity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("number",number)
            intent.putExtra("number1",number1)
            intent.putExtra("number2",number2)
            intent.putExtra("number3",number3)
            intent.putExtra("number4",number4)
            intent.putExtra("number5",number5)
            startActivity(intent)

        }
    }
}
