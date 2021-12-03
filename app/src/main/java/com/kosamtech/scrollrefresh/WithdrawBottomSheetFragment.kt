package com.kosamtech.scrollrefresh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.kosamtech.scrollrefresh.databinding.FragmentWithdrawBottomSheetBinding

class WithdrawBottomSheetFragment: BottomSheetDialogFragment() {
    private lateinit var binding: FragmentWithdrawBottomSheetBinding
    companion object {
        const val TAG = "WithdrawBottomSheetFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_withdraw_bottom_sheet, container, false)

        binding.btnWithdrawFromFloat.setOnClickListener { view: View ->
            Toast.makeText(requireContext(), "Withdraw From Float", Toast.LENGTH_SHORT).show()
        }
        binding.btnWithdrawFromInterest.setOnClickListener { view: View ->
            Toast.makeText(requireContext(), "Withdraw From Interest", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}