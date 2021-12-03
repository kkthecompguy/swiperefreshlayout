package com.kosamtech.scrollrefresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kosamtech.scrollrefresh.databinding.FragmentLoadBinding


/**
 * A simple [Fragment] subclass.
 * Use the [LoadFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoadFragment : Fragment() {
    private lateinit var binding: FragmentLoadBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_load, container, false)

        val loadBottomSheetFragment = LoadBottomSheetFragment()
        binding.btnLoadMoney.setOnClickListener { view:View ->
            loadBottomSheetFragment.show(getParentFragmentManager(), loadBottomSheetFragment.tag)
        }

        return binding.root
    }

}