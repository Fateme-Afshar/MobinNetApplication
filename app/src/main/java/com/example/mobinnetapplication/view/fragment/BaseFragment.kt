package com.example.mobinnetapplication.view.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import com.example.mobinnetapplication.view.Callbacks
import java.lang.ClassCastException

open class BaseFragment : Fragment() {
    protected lateinit var callbacks:Callbacks
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Callbacks)
            callbacks=context
        else
            throw ClassCastException("First implement callbacks interface.")
    }
}