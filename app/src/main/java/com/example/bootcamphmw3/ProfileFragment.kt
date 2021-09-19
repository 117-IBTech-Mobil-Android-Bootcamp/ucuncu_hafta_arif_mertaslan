package com.example.bootcamphmw3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bootcamphmw3.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentProfileBinding.inflate(inflater)

        binding.bottomNav.setupWithNavController(findNavController())

        binding.profileEditCard.setOnClickListener {
            findNavController().navigate(R.id.avatarFragment)
        }

        return binding.root
    }

}