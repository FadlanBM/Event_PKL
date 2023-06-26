package com.example.mobile.ui.generatelink

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GenerateViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Generate Fragment"
    }
    val text: LiveData<String> = _text
}