package com.example.mutualproperty.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mutualproperty.R
import kotlinx.android.synthetic.main.activity_forget_password.*

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        setupActionBar()

    }
    private fun setupActionBar() {
        setSupportActionBar(toolbar_forgot_password_activity)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowTitleEnabled(false)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_new_24)
        }
        toolbar_forgot_password_activity.setNavigationOnClickListener { onBackPressed() }
    }
}