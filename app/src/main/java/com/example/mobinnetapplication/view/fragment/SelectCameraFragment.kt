package com.example.mobinnetapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.adapter.ItemsCameraAdapter
import com.example.mobinnetapplication.databinding.FragmentSelectCameraBinding

class SelectCameraFragment : DialogFragment() {
    private lateinit var binding: FragmentSelectCameraBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_select_camera, container, false)
        setupAdapter()
        return binding.root
    }

    private fun setupAdapter(){
        val adapter=ItemsCameraAdapter(arrayListOf())

        binding.recyclerView.apply {
            this.adapter=adapter
            layoutManager=LinearLayoutManager(requireContext())
        }
    }
}