package com.example.mutualproperty.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mutualproperty.R
import com.example.mutualproperty.viewmodel.AddPropertyViewModel

class AddPropertyFragment : Fragment() {

    private lateinit var addPropertyViewModel: AddPropertyViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addPropertyViewModel =
            ViewModelProvider(this).get(AddPropertyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add_property, container, false)
        val textView: TextView = root.findViewById(R.id.text_add_property)
        addPropertyViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}