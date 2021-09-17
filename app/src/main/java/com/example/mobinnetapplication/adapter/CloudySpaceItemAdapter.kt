package com.example.mobinnetapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.ItemCloudySpaceBinding

class CloudySpaceItemAdapter : RecyclerView.Adapter<CloudySpaceItemAdapter.Holder>() {

    class Holder(binding: ItemCloudySpaceBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = DataBindingUtil.inflate<ItemCloudySpaceBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_cloudy_space,
            parent,
            false
        )

        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}