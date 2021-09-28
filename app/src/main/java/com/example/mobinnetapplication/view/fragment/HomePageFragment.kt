package com.example.mobinnetapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.FragmentHomePageBinding

class HomePageFragment : BaseFragment() {
    private lateinit var binding:FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_home_page,container,false)
        binding.fragment=this
        return binding.root
    }

    fun onCategoryImvClickListener(){
        callbacks.openLayoutCategoryFragment(1,"selectionLayerStyle")
    }
}