package com.example.mobile.ui.users

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UsersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
<<<<<<< HEAD
        value = "This is slideshow Fragment"
=======
        value = "This is User Fragment"
>>>>>>> 018adf1013fd4754b043529af95007d8b02d725e
    }
    val text: LiveData<String> = _text
}