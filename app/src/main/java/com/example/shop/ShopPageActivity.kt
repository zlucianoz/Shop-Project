package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shop_page.*

class ShopPageActivity : AppCompatActivity() {

    var name : String = ""
    var number :String =""
    var number1 : String = ""
    var number2 :String =""
    var number3 : String = ""
    var number4 :String =""
    var number5 : String = ""
    var number6 : String = ""
    var number7 : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_page)

        var name = intent.getStringExtra("name")
        textView14.text = name



        Buy.setOnClickListener {

            number = test.text.toString()
            number1 = test2.text.toString()
            number2 = test3.text.toString()
            number3 = test4.text.toString()
            number4 = test5.text.toString()
            number5 = test6.text.toString()
            number6 = test7.text.toString()
            number7 = test8.text.toString()
            name = textView14.text.toString()
            val intent = Intent(this,BuyPageActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("number",number)
            intent.putExtra("number1",number1)
            intent.putExtra("number2",number2)
            intent.putExtra("number3",number3)
            intent.putExtra("number4",number4)
            intent.putExtra("number5",number5)
            intent.putExtra("number6",number6)
            intent.putExtra("number7",number7)
            startActivity(intent)

        }
        NEXT.setOnClickListener {

            name = textView14.text.toString()
            val intent = Intent (this,RicePageActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)


        }


    }
}
