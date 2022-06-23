package com.abdallah.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    lateinit var mNavCon:NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mNavCon = findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn  = view.findViewById<Button>(R.id.button)
        btn.setOnClickListener {
//            val data = bundleOf("w" to "welcom")
//
//            mNavCon.navigate(R.id.secondFragment,data)

            val data ="wel"
            val action =
                HomeFragmentDirections.actionHomeFragmentToSecondFragment2(data)
            mNavCon.navigate(action)

        }
    }
    }