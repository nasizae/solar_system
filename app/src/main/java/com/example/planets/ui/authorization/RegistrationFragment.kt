package com.example.planets.ui.authorization

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.planets.R
import com.example.planets.data.model.RegistrationModel
import com.example.planets.databinding.FragmentRegistrationBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class RegistrationFragment : Fragment() {

    private lateinit var binding:FragmentRegistrationBinding
    private lateinit var myDataBase:DatabaseReference
    private lateinit var auth:FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentRegistrationBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRegisterUser()
        initListeners()
        initView()

    }

    private fun initView() {
        auth=FirebaseAuth.getInstance()
    }

    private fun initListeners() {
        binding.btnSign.setOnClickListener {
            findNavController().navigate(R.id.authorizationFragment)
        }
    }

    private fun initRegisterUser() {
        myDataBase=Firebase.database.getReference(USER_KEY)
        binding.btnRegister.setOnClickListener {
            if (!TextUtils.isEmpty(binding.etEmail.text.toString()) &&
                !TextUtils.isEmpty(binding.etPassword.text.toString())
            ) {
                auth.createUserWithEmailAndPassword(
                    binding.etEmail.text.toString(),
                    binding.etPassword.text.toString()
                ).addOnCompleteListener {
                    if(it.isSuccessful){
                        val user:FirebaseUser?=auth.currentUser
                        val uid=user?.uid
                        if(uid!=null){
                            setDataToDataBase(uid)
                        }

                    findNavController().navigate(R.id.navigation_home)
                    }
                    else{
                        Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else {
                Toast.makeText(requireContext(), "пустое поле", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun setDataToDataBase(uid: String) {
        val fname=binding.etFname.text.toString()
        val sname=binding.etSname.text.toString()
        val email=binding.etEmail.text.toString()
        val password=binding.etPassword.text.toString()
        val users=RegistrationModel(uid,fname, sname, email, password)
        myDataBase.child(uid).setValue(users)
    }

    companion object{
        const val USER_KEY="Users"
    }
}