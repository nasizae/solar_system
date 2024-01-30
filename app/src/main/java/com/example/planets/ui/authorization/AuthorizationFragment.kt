package com.example.planets.ui.authorization

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.planets.R
import com.example.planets.databinding.FragmentAuthorizationBinding
import com.example.planets.ui.profile.ProfileFragment
import com.google.firebase.auth.FirebaseAuth

class AuthorizationFragment : Fragment() {

    private lateinit var binding: FragmentAuthorizationBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAuthorizationBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initView()

    }

    override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        if (currentUser != null) {
            findNavController().navigate(R.id.navigation_home)
        }
    }

    private fun initView() {
        auth = FirebaseAuth.getInstance()
    }

    private fun initListeners() {
        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.registrationFragment)
        }
        binding.btnSignIn.setOnClickListener {
            if (!TextUtils.isEmpty(binding.etEmail.text.toString()) &&
                !TextUtils.isEmpty(binding.etEmail.text.toString())
            ) {
                auth.signInWithEmailAndPassword(
                    binding.etEmail.text.toString(),
                    binding.etPassword.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful){
                        findNavController().navigate(R.id.navigation_home)
                    }
                    else{
                        Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else{
                Toast.makeText(requireContext(), "пустое поле", Toast.LENGTH_SHORT).show()
            }
        }
    }
}