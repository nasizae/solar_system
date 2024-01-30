package com.example.planets.ui.profile

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.planets.R
import com.example.planets.data.model.RegistrationModel
import com.example.planets.databinding.AlertDialogExitBinding
import com.example.planets.databinding.FragmentProfileBinding
import com.example.planets.ui.authorization.RegistrationFragment.Companion.USER_KEY
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private val auth: FirebaseAuth by lazy {
        FirebaseAuth.getInstance()
    }
    private lateinit var database: DatabaseReference

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initProfile()
    }
    private fun initProfile() {
        val user: FirebaseUser? = auth.currentUser
        val uid: String? = user?.uid
        database = FirebaseDatabase.getInstance().getReference(USER_KEY)
        if (uid != null) {
            database.child(uid).addValueEventListener(object : ValueEventListener {
                @SuppressLint("SetTextI18n")
                override fun onDataChange(snapshot: DataSnapshot) {
                    val value = snapshot.getValue(RegistrationModel::class.java)
                    binding.UserName.text = "${value?.fname.toString()} ${value?.sname.toString()}"
                }

                override fun onCancelled(error: DatabaseError) {
                    Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }

    private fun initListeners() {
        binding.btnExit.setOnClickListener {
            val alertBinding = AlertDialogExitBinding.inflate(layoutInflater)
            val alertDialogBuilder =
                AlertDialog.Builder(requireContext(), R.style.CustomAlertDialog)
            alertDialogBuilder.setView(alertBinding.root)
            val alertDialog = alertDialogBuilder.create()
            alertBinding.btnYes.setOnClickListener {
                auth.signOut()
                alertDialog.dismiss()
                findNavController().navigate(R.id.authorizationFragment)
            }
            alertBinding.btnNo.setOnClickListener {
                alertDialog.dismiss()
            }
            alertDialog.show()

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}