package com.example.mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobile.databinding.ActivityMainBinding
import com.example.mobile.databinding.ActivityNavigasiBinding
import com.example.mobile.databinding.ActivityShowAuthBinding
import com.example.mobile.ui.Auth.LoginActivity
import com.example.mobile.ui.Auth.RegisterActivity

class ShowAuthActivity : AppCompatActivity() {
    private var _binding: ActivityShowAuthBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_auth)

        _binding = ActivityShowAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        binding.btnSignUp.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
        binding.backAuth.setOnClickListener {
            onBackPressed()
        }
    }
}