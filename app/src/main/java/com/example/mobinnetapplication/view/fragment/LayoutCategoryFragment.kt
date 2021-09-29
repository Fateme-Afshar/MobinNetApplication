package com.example.mobinnetapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.FragmentCategoryDialogBinding
import com.example.mobinnetapplication.uiUtils.UiStyle
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class LayoutCategoryFragment : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentCategoryDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_category_dialog,container,false)
        binding.fragment=this
        dialog?.window?.setLayout(200, -1)
        return binding.root
    }

     fun sendResult(type:UiStyle) {
        val bundle = Bundle()
        bundle.putInt("rowStyle",type.ordinal)
        requireActivity().supportFragmentManager.setFragmentResult("1", bundle)
         dismiss()
    }
}
