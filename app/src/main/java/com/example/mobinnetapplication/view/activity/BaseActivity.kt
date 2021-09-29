package com.example.mobinnetapplication.view.activity

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.ActivityBaseBinding
import com.example.mobinnetapplication.view.Callbacks
import com.example.mobinnetapplication.view.fragment.*
import com.google.android.material.navigation.NavigationBarView

class BaseActivity : AppCompatActivity(), Callbacks {
    private lateinit var binding: ActivityBaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_base)

        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

        if (fragment == null)
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, LoginFragment())
                .setCustomAnimations(R.anim.fade,R.anim.fade).commit()
        setupBottomNavigation()
    }

    fun setupBottomNavigation(){
        binding.bottomNav.setOnItemSelectedListener(object : NavigationBarView.OnItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                return when(item.itemId){
                    R.id.menu_home->{
                        openFragment(HomePageFragment())
                        true
                    }
                    R.id.menu_cloud-> {
                        openFragment(MainCloudySpaceFragment())
                        true
                    }
                    R.id.menu_account->{
                        openFragment(ProfileFragment())
                        true
                    }
                    else-> false
                }
            }
        })
    }

    private fun openFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,fragment)
            .addToBackStack(HomePageFragment()::class.simpleName)
            .setCustomAnimations(R.anim.fade, R.anim.fade).
            commit()
    }

    override fun openSignUpFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,SignUpFragment())
            .addToBackStack(LoginFragment()::class.simpleName)
            .setCustomAnimations(R.anim.fade, R.anim.fade).
            commit()
    }

    override fun openMainCloudySpaceFragment() {
        binding.bottomNav.menu.getItem(1).isChecked = true
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,MainCloudySpaceFragment())
            .setCustomAnimations(R.anim.fade,R.anim.fade).
            commit()

        binding.toolbar.visibility=View.VISIBLE
        binding.bottomNav.visibility=View.VISIBLE
    }

    override fun openLayoutCategoryFragment(requestCode:Int,tag:String) {
        val layoutCategoryFragment=LayoutCategoryFragment()

        layoutCategoryFragment.show(supportFragmentManager,tag)
    }

    override fun openItemCameraFragment(tag:String) {
        val selectCameraFragment=SelectCameraFragment()

        selectCameraFragment.show(supportFragmentManager,tag)
    }
}