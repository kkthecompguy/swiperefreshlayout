package com.kosamtech.scrollrefresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kosamtech.scrollrefresh.databinding.FragmentCustomersBinding


/**
 * A simple [Fragment] subclass.
 * Use the [CustomersFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CustomersFragment : Fragment() {
    private lateinit var binding: FragmentCustomersBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_customers, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_customers, container, false)

        return binding.root
    }

}