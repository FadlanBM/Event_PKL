package com.example.mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.mobile.databinding.ActivitySplashScreenBinding
import com.example.mobile.databinding.FragmentEventBinding
import com.example.mobile.util.Preft

class SplashScreenActivity : AppCompatActivity() {
    private var _binding: ActivitySplashScreenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        _binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textSplash.alpha=0f
        binding.textSplash.animate().setDuration(2000).alpha(1f).withEndAction {
<<<<<<< HEAD
            startActivity(Intent(this,MainActivity::class.java))
=======
            val sp= Preft(this)
            if (sp.getIsLogin()){
                startActivity(Intent(this,NavigasiActivity::class.java))
            }else{
                startActivity(Intent(this,MainActivity::class.java))
            }
>>>>>>> 018adf1013fd4754b043529af95007d8b02d725e
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

    }
}