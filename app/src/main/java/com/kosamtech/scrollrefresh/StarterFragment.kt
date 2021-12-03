package com.kosamtech.scrollrefresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kosamtech.scrollrefresh.databinding.FragmentStarterBinding


/**
 * A simple [Fragment] subclass.
 * Use the [StarterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StarterFragment : Fragment() {
    private lateinit var binding: FragmentStarterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_starter, container, false)

        return binding.root
    }

}