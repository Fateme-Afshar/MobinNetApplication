package com.example.mobinnetapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.adapter.TabLayoutAdapter
import com.example.mobinnetapplication.databinding.FragmentMainCloudySpaceBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainCloudySpaceFragment : BaseFragment() {
    private lateinit var binding: FragmentMainCloudySpaceBinding
    private val tabNames = arrayListOf( "درخواست های در حال اجرا","فضای ابری")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_main_cloudy_space, container, false)
        setupAdapter()
        callbacks.itemVisibility(1)
        return binding.root
    }

    private fun setupAdapter() {
        val tabLayoutAdapter = TabLayoutAdapter(requireActivity())
        binding.viewPager.adapter = tabLayoutAdapter
        TabLayoutMediator(
            binding.tabLayout, binding.viewPager
        ) { tab, position -> tab.text = tabNames[position] }.attach()
    }
}