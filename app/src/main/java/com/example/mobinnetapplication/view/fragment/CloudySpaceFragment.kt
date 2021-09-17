package com.example.mobinnetapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.adapter.CloudySpaceItemAdapter
import com.example.mobinnetapplication.databinding.FragmentCloudySpaceBinding

class CloudySpaceFragment : BaseFragment() {
    private lateinit var binding: FragmentCloudySpaceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_cloudy_space, container, false)
        setupAdapter()
        return binding.root
    }

    private fun setupAdapter() {
        val adapter=CloudySpaceItemAdapter()

        binding.recyclerView.apply {
            this.adapter=adapter
            layoutManager=LinearLayoutManager(requireContext())
        }
    }
}