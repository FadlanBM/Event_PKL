package com.example.mobile.ui.Auth

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.mobile.R
import com.example.mobile.databinding.ActivityLoginBinding
import com.example.mobile.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onBackPressed() {
        val builder:AlertDialog.Builder= AlertDialog.Builder(this)
            builder.setTitle("Keluar")
            builder.setMessage("Pakah anda yakin ingin kembali?")
            builder.setPositiveButton("Ya",DialogInterface.OnClickListener{dialog, which ->
                finish()
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener{dialog, which ->
            dialog.dismiss()
            })
        builder.show()
    }


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
        binding.btnToLogin.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}