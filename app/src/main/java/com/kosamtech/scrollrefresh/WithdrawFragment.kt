package com.kosamtech.scrollrefresh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.kosamtech.scrollrefresh.databinding.FragmentWithdrawBinding


/**
 * A simple [Fragment] subclass.
 * Use the [WithdrawFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WithdrawFragment : Fragment() {
    private lateinit var binding: FragmentWithdrawBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_withdraw, container, false)

        val withdrawBottomSheetFragment = WithdrawBottomSheetFragment()
        binding.btnWithdrawMoney.setOnClickListener { view:View ->
            withdrawBottomSheetFragment.show(getParentFragmentManager(), withdrawBottomSheetFragment.tag)
        }

        return binding.root
    }

}