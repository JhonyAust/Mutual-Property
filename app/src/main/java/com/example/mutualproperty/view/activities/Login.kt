package com.example.mutualproperty.view.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mutualproperty.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_register.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tv_signup.setOnClickListener(){
            val intent = Intent(this, Register::class.java)
            startActivity(intent)


        }
       btn_login_close.setOnClickListener(){
           val intent = Intent(this, Menu::class.java)
           startActivity(intent)
       }
        tv_forget_password.setOnClickListener(){
            val intent = Intent(this@Login, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }
    }


}