package com.example.mobinnetapplication.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentResultListener
import com.example.mobinnetapplication.R
import com.example.mobinnetapplication.databinding.FragmentHomePageBinding
import com.example.mobinnetapplication.uiUtils.UiStyle

class HomePageFragment : BaseFragment() {
    private lateinit var binding:FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_page, container, false)
        binding.fragment = this
        requireActivity().supportFragmentManager.setFragmentResultListener(
            "1",
            requireActivity(),
            object : FragmentResultListener {
                override fun onFragmentResult(requestKey: String, result: Bundle) {
                    when (result["rowStyle"]) {
                        UiStyle.ALONE.ordinal -> {
                            setupVisibility(View.VISIBLE, View.GONE, View.GONE, View.GONE, 1f)
                        }
                        UiStyle.TWO_HORIZONTAL.ordinal -> {
                            setupVisibility(View.VISIBLE, View.GONE, View.VISIBLE, View.GONE, 0.53f)
                        }
                        UiStyle.TWO_VERTICAL.ordinal -> {
                            setupVisibility(View.VISIBLE, View.VISIBLE, View.GONE, View.GONE, 1f)
                        }
                        UiStyle.THREE_BIG_TOP.ordinal -> {
                            setupVisibility(
                                View.GONE,
                                View.VISIBLE,
                                View.VISIBLE,
                                View.VISIBLE,
                                0.53f
                            )
                        }
                        UiStyle.THREE_BIG_BOTTOM.ordinal -> {
                            setupVisibility(
                                View.VISIBLE,
                                View.VISIBLE,
                                View.GONE,
                                View.VISIBLE,
                                0.53f
                            )
                        }
                        UiStyle.FOUR_IN_ROW.ordinal -> {
                            setupVisibility(
                                View.VISIBLE,
                                View.VISIBLE,
                                View.VISIBLE,
                                View.VISIBLE,
                                0.53f
                            )
                        }
                    }
                }

            })
        return binding.root
    }

    private fun setupVisibility(
        topLeftPartVisibility: Int,
        topRightPartVisibility: Int,
        bottomLeftPartVisibility: Int,
        bottomRightPartVisibility: Int,
        guidelinePercent: Float
    ) {
        binding.topLayoutLeft.visibility = topLeftPartVisibility
        binding.btnTopLayoutLeft.visibility = topLeftPartVisibility

        binding.topLayoutRight.visibility = topRightPartVisibility
        binding.btnTopLayoutRight.visibility = topRightPartVisibility

        binding.bottomLayoutLeft.visibility = bottomLeftPartVisibility
        binding.btnBottomLayoutLeft.visibility = bottomLeftPartVisibility

        binding.bottomLayoutRight.visibility = bottomRightPartVisibility
        binding.btnBottomLayoutRight.visibility = bottomRightPartVisibility

        binding.guidelineHorizontalMiddle.setGuidelinePercent(guidelinePercent)
    }

    fun onCategoryImvClickListener() {
        callbacks.openLayoutCategoryFragment(1, "selectionLayerStyle")
    }
}