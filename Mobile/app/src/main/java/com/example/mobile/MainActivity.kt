package com.example.mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mobile.databinding.ActivityMainBinding
import com.example.mobile.ui.formevent.VerifyCodeActivity
import com.example.mobile.util.Preft

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCreateEvent.setOnClickListener {
<<<<<<< HEAD
            val sp= Preft(this)
            if (sp.getIsLogin()){
                startActivity(Intent(this,NavigasiActivity::class.java))
            }else{
                startActivity(Intent(this,ShowAuthActivity::class.java))
            }
=======
            startActivity(Intent(this,ShowAuthActivity::class.java))
>>>>>>> 018adf1013fd4754b043529af95007d8b02d725e

        }
        binding.joinEvent.setOnClickListener {
            startActivity(Intent(this,VerifyCodeActivity::class.java))
        }

<<<<<<< HEAD

=======
        val sp=Preft(this)
        if (sp.getIsLogin()){
            Log.d("TAG","True")
        }else{
            Log.d("TAG","false")
        }
>>>>>>> 018adf1013fd4754b043529af95007d8b02d725e
    }
}