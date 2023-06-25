package com.example.mobile.ui.Auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile.R
import com.example.mobile.databinding.ActivityLoginBinding
import com.example.mobile.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private var _binding: ActivityRegisterBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        _binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}