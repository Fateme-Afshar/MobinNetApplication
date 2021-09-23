package com.example.mobinnetapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        onClicks()
        return binding.root
    }

    private fun onClicks() {
      binding.btnSignUp.setOnClickListener {
            callbacks.openSignUpFragment()
        }
        binding.btnSubmit.setOnClickListener {
            callbacks.openMainCloudySpaceFragment()
        }
    }
}