package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var name :String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Registerbutton.setOnClickListener {


            name = IdText.text.toString()
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)

        }

        Login.setOnClickListener {

            name = IdText.text.toString()
            val intent = Intent (this,ShopPageActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)


        }





    }
}
