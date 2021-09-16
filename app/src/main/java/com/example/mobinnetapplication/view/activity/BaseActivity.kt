package com.example.mobinnetapplication.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.ActivityBaseBinding
import com.example.mobinnetapplication.view.fragment.LoginFragment

class BaseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)

        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (fragment == null)
            supportFragmentManager.beginTransaction().
            add(R.id.fragment_container, LoginFragment())
                .commit()
    }
}