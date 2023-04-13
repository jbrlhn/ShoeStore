package com.udacity.shoestore.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.login)
        binding.loginButton.setOnClickListener {  findNavController().navigate(LoginFragmentDirections.loginToWelcome()) }

        binding.signUpButton.setOnClickListener {  findNavController().navigate(LoginFragmentDirections.loginToWelcome()) }

        return binding.root

    }
}