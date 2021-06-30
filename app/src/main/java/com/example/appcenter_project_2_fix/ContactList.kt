package com.example.appcenter_project_2_fix

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appcenter_project_2_fix.databinding.ListContactBinding

class ContactList : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = ListContactBinding.inflate(inflater, container, false)

        val listAdepter = ListAdepter()

        binding.recycler.adapter = listAdepter

        binding.recycler.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        return binding.root
    }
}