package com.example.mutualproperty.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.mutualproperty.R
import kotlinx.android.synthetic.main.activity_add_properties.*
import kotlinx.android.synthetic.main.activity_search.*


class AddProperties : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_properties)
        setupActionBar()
        setupSimpleSpinner2()
    }
    private fun setupActionBar(){
        setSupportActionBar(toolbar_add_property_activity)
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
        }
        toolbar_add_property_activity.setNavigationOnClickListener { onBackPressed() }
    }

    private fun setupSimpleSpinner2() {

        val adapter = ArrayAdapter.createFromResource(
                this,
                R.array.cities,
                android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        simpleSpinner2.adapter = adapter

        simpleSpinner2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                val selectedItem = parent!!.getItemAtPosition(position)
                Toast.makeText(this@AddProperties, "$selectedItem Selected", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Use as per your wish
            }
        }
    }

}