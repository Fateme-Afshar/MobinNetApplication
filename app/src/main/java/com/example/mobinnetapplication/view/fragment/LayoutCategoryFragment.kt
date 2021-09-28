package com.example.mobinnetapplication.view.fragment

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.FragmentCategoryDialogBinding
import com.example.mobinnetapplication.databinding.FragmentHomePageBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class LayoutCategoryFragment : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_category_dialog,container,false)
        return binding.root
    }
}