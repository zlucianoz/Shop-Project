package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {


    var name : String = ""
    var number : String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)




        Ok.setOnClickListener {
            name = editText.text.toString()
            number = passwordText.text.toString()
            val intent = Intent(this,CompleteRegisterActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("number",number)
            startActivity(intent)

        }


    }
}
