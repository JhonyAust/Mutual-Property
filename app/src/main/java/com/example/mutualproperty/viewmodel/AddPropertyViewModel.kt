package com.example.mutualproperty.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddPropertyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Add Property Fragment"
    }
    val text: LiveData<String> = _text
}