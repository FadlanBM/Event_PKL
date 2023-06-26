package com.example.mobile.ui.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile.NavigasiActivity
import com.example.mobile.R
import com.example.mobile.databinding.ActivityLoginBinding
import com.example.mobile.databinding.ActivityShowAuthBinding

class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this,NavigasiActivity::class.java))
        }
    }
}