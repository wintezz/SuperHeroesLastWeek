package com.example.alexpetrov.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.alexpetrov.MainApp.Companion.router
import com.example.alexpetrov.R
import com.example.alexpetrov.databinding.FragmentProgramBinding

class FragmentProgram : Fragment(R.layout.fragment_program) {

    private lateinit var binding: FragmentProgramBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProgramBinding.bind(view)

        binding.accept.setOnClickListener {
            router.exit()
        }
    }
}