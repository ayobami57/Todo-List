package com.example.todolist.Shopping

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.todolist.R
import com.example.todolist.databinding.FragmentShoppingBinding


class ShoppingFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentShoppingBinding>(inflater, R.layout.fragment_shopping, container, false)
    return binding.root
    }



}