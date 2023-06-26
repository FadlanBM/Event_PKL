package com.example.mobile.ui.formevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile.R
import com.example.mobile.databinding.ActivityVerifyCodeBinding

class VerifyCodeActivity : AppCompatActivity() {
    private  var _binding:ActivityVerifyCodeBinding?=null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_code)

        _binding= ActivityVerifyCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}