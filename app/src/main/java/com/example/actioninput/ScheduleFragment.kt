package com.example.actioninput

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.actioninput.databinding.FragmentScheduleBinding

class ScheduleFragment : Fragment() {

    private lateinit var binding:FragmentScheduleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScheduleBinding
            .inflate(inflater,container,false)
        binding.floatingActionButton.setOnClickListener{
            findNavController().navigate(R.id.action_scheduleFragment_to_newschodulFragment)
        }
        return binding.root
    }
}