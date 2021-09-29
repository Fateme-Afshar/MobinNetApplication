package com.example.mobinnetapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.ItemSelectCameraBinding

class ItemsCameraAdapter(modelList: List<Int>) : BaseAdapter<Int>(modelList) {
    class Holder(binding: ItemSelectCameraBinding) : BaseHolder<Int>(binding)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<Int> {
        val binding = DataBindingUtil.inflate<ItemSelectCameraBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_select_camera, parent, false
        )

        return Holder(binding)
    }
}