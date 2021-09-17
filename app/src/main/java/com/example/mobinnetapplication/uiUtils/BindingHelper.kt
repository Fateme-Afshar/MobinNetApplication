package com.example.mobinnetapplication.uiUtils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.mobinnetapplication.R
import com.squareup.picasso.Picasso

class BindingHelper {
    companion object {
        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(imageView: ImageView, url: String) {
            Picasso.get().load(R.drawable.test).fit().into(imageView)
        }
    }
}