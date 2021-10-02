package com.example.mobinnetapplication.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.ActivityBaseBinding
import com.example.mobinnetapplication.view.Callbacks
import com.example.mobinnetapplication.view.fragment.LayoutCategoryFragment
import com.example.mobinnetapplication.view.fragment.LoginFragment
import com.example.mobinnetapplication.view.fragment.SelectCameraFragment

class BaseActivity : AppCompatActivity(), Callbacks {
    private lateinit var binding: ActivityBaseBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)
        navController = Navigation.findNavController(this, R.id.fragment_container)

        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (fragment == null)
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, LoginFragment())
                .setCustomAnimations(R.anim.fade, R.anim.fade).commit()
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    navController.navigate(R.id.des_home_page)

                    true
                }
                R.id.menu_cloud -> {
                    navController.navigate(R.id.des_main_cloudy_space)
                    true
                }
                R.id.menu_account -> {
                    navController.navigate(R.id.des_profile)
                    true
                }
                else -> false
            }
        }
    }

    override fun openLayoutCategoryFragment(requestCode: Int, tag: String) {
        val layoutCategoryFragment = LayoutCategoryFragment()

        layoutCategoryFragment.show(supportFragmentManager, tag)
    }

    override fun openItemCameraFragment(tag: String) {
        val selectCameraFragment = SelectCameraFragment()

        selectCameraFragment.show(supportFragmentManager, tag)
    }

    override fun openFragment(desId: Int) {
        navController.navigate(desId)
        if (binding.toolbar.visibility == View.GONE) {
            binding.toolbar.visibility = View.VISIBLE
            binding.bottomNav.visibility = View.VISIBLE
            binding.bottomNav.menu.getItem(3).isChecked = true
        }
    }

    override fun itemVisibility(itemId: Int) {
        binding.bottomNav.menu.getItem(itemId).isChecked = true
    }
}