package com.example.mobile.ui.Auth

import android.app.AlertDialog
import android.app.AlertDialog.Builder
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mobile.NavigasiActivity
import com.example.mobile.R
import com.example.mobile.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    override fun onBackPressed() {
        val builder: AlertDialog.Builder = Builder(this)
        builder.setTitle("Keluar")
        builder.setMessage("Apakah Anda yakin ingin kembali?")
        builder.setPositiveButton("Ya", DialogInterface.OnClickListener { dialog, which ->
            finish()
        })
        builder.setNegativeButton("Tidak",
            DialogInterface.OnClickListener { dialog, which ->
                // Tambahkan kode yang ingin Anda jalankan saat pengguna menekan "Tidak"
                dialog.dismiss() // Menutup dialog
            })
        builder.show()
    }
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
        binding.btnToRegister.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
<<<<<<< Updated upstream
=======
    setData()
    }

    fun setData(){
        viewModel.text.observe(this){
            binding.tbUsers.setText(it)
        }
        binding.btnLogin.setOnClickListener {
            val body=LoginRequest(binding.tbUsers.text.toString(),binding.tbPassword.text.toString())
            viewModel.login(body).observe(this,{
                
            })
        }
>>>>>>> Stashed changes
    }
}