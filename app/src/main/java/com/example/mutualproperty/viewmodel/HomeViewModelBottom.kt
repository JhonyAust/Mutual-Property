package com.example.mutualproperty.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModelBottom : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home bottom Fragment"
    }
    val text: LiveData<String> = _text
}