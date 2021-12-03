package com.kosamtech.scrollrefresh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.kosamtech.scrollrefresh.databinding.FragmentLoadBottomSheetBinding

class LoadBottomSheetFragment: BottomSheetDialogFragment() {
    private lateinit var binding: FragmentLoadBottomSheetBinding

    companion object {
        const val TAG = "LoadBottomSheetFragment"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_load_bottom_sheet, container, false)

        binding.btnLoadFromThisNo.setOnClickListener { view: View ->
            Toast.makeText(requireContext(), "Loading Float From This Number", Toast.LENGTH_SHORT).show()
        }

        binding.btnLoadFromAnotherNo.setOnClickListener { view: View ->
            Toast.makeText(requireContext(), "Loading Float From Another Number", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}