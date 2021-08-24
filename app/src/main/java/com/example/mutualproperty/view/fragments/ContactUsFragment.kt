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
import com.example.mutualproperty.viewmodel.ContactUsViewModel


class ContactUsFragment : Fragment() {

    private lateinit var contactUsViewModel: ContactUsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        contactUsViewModel =
            ViewModelProvider(this).get(ContactUsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_contact_us, container, false)
        val textView: TextView = root.findViewById(R.id.text_contact_us)
        contactUsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}