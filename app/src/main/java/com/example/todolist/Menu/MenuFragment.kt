package com.example.todolist.Menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.todolist.R
import com.example.todolist.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentMenuBinding>(inflater, R.layout.fragment_menu, container, false)
        binding.plannedCard.setOnClickListener{view: View ->Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_plannedFragment)}
        binding.personalCard.setOnClickListener{view: View ->Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_personal)}
        binding.workCard.setOnClickListener{view: View ->Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_workFragment)}
        binding.shoppingCard.setOnClickListener{view: View ->Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_shoppingFragment)}



        return binding.root}


}