package com.example.toolbar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.toolbar.R
import kotlinx.android.synthetic.main.fragment_setting.*


class FragmentSetting : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        leave_balance_layout.setOnClickListener{
//            Navigation.createNavigateOnClickListener(R.id.action_fragmentSetting_to_fragmentLeaveBalance)
            findNavController().navigate(R.id.action_fragmentSetting_to_fragmentLeaveBalance)
        }

        profile_layout.setOnClickListener {
//            Navigation.createNavigateOnClickListener(R.id.action_fragmentSetting_to_fragmentProfile)
            findNavController().navigate(R.id.action_fragmentSetting_to_fragmentProfile)
        }

    }
}