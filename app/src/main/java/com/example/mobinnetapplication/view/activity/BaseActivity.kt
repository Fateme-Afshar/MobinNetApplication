package com.example.mobinnetapplication.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.ActivityBaseBinding
import com.example.mobinnetapplication.view.Callbacks
import com.example.mobinnetapplication.view.fragment.LoginFragment
import com.example.mobinnetapplication.view.fragment.MainCloudySpaceFragment
import com.example.mobinnetapplication.view.fragment.SignUpFragment

class BaseActivity : AppCompatActivity(), Callbacks {
    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)

        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (fragment == null)
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, LoginFragment())
                .commit()

    }

    override fun openSignUpFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,SignUpFragment())
            .addToBackStack(LoginFragment()::class.simpleName)
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).
            commit()
    }

    override fun openMainCloudySpaceFragment() {
        binding.toolbar.visibility=View.VISIBLE
        binding.bottomNav.visibility=View.VISIBLE
        binding.bottomNav.menu.getItem(1).isChecked = true
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,MainCloudySpaceFragment())
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out).
            commit()
    }
}