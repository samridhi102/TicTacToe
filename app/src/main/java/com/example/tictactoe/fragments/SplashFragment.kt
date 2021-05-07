package com.example.tictactoe.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.tictactoe.R
import com.example.tictactoe.activity.MainActivity
import java.lang.System.exit

class SplashFragment: Fragment(R.layout.fragment_splash) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler().postDelayed( {
            startActivity(Intent(requireContext(), MainActivity::class.java))
            activity?.overridePendingTransition(R.anim.enter, R.anim.exit)
            activity?.finish()
        },2000
        )
    }
}