package com.example.mobinnetapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.ItemCloudySpaceBinding

class CloudySpaceItemAdapter(modelList: List<Int>) : BaseAdapter<Int>(modelList) {

    class Holder(binding: ItemCloudySpaceBinding) : BaseHolder<Int>(binding)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<Int> {
        val binding = DataBindingUtil.inflate<ItemCloudySpaceBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_cloudy_space,
            parent,
            false
        )

        return Holder(binding)
    }
}