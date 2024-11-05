package com.example.basketapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.basketapp.R

class LoginFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnLogin).setOnClickListener {
            // Lógica para iniciar sesión
        }

        view.findViewById<TextView>(R.id.tvRegister).setOnClickListener {
            // Navegar al RegisterFragment
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }
}