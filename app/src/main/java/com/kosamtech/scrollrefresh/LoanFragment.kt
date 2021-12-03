package com.kosamtech.scrollrefresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kosamtech.scrollrefresh.databinding.FragmentLoanBinding


/**
 * A simple [Fragment] subclass.
 * Use the [LoanFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoanFragment : Fragment() {
    private lateinit var binding: FragmentLoanBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_loan, container, false)

        return binding.root
    }


}