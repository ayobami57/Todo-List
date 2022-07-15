package com.example.todolist.PersonalViewModel

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.todolist.R
import com.example.todolist.databinding.FragmentPersonalBinding
import java.text.SimpleDateFormat
import java.util.*


open class Personal : Fragment() {


    private lateinit var builder : AlertDialog.Builder
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPersonalBinding>(inflater, R.layout.fragment_personal, container, false)
        binding.floater.setOnClickListener{
            var dialog = CustomDialog()
            dialog.show((activity as AppCompatActivity).supportFragmentManager, "custom dial" )}



        return binding.root
    }


}