package com.kosamtech.scrollrefresh

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.kosamtech.scrollrefresh.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.btnLoad.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_home_fragment_to_load_fragment)
        }

        binding.btnLoans.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_home_fragment_to_loan_fragment)
        }
        binding.btnCustomers.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_home_fragment_to_customers_fragment)
        }
        binding.btnWidthraw.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_home_fragment_to_withdraw_fragment)
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overflow_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) || super.onOptionsItemSelected(item)
    }
}