package com.udacity.shoestore.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeInfoBinding
import com.udacity.shoestore.screens.shoelist.ShoeListFragmentDirections

class ShoeInfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentShoeInfoBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_info, container, false)

        binding.cancelButton.setOnClickListener { findNavController().navigate(ShoeInfoFragmentDirections.cancelToShoeList()) }
        return binding.root
    }
}