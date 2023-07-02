package com.example.mobile.ui.event

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EventViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
<<<<<<< HEAD
        value = "This is gallery Fragment"
=======
        value = "This is Event Fragment"
>>>>>>> 018adf1013fd4754b043529af95007d8b02d725e
    }
    val text: LiveData<String> = _text
}