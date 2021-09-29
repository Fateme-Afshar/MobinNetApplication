package com.example.mobinnetapplication.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class  BaseAdapter<T>(private val list:List<T>) : RecyclerView.Adapter<BaseAdapter.BaseHolder<T>>() {

     open class BaseHolder <T> (viewBinding: ViewBinding) : RecyclerView.ViewHolder(viewBinding.root)

    override fun onBindViewHolder(holder: BaseHolder<T>, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}