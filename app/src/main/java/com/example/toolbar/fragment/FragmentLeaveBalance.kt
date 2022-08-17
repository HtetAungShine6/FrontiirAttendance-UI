package com.example.toolbar.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.toolbar.LeaveBalanceAdapter
import com.example.toolbar.R
import kotlinx.android.synthetic.main.fragment_leave_balance.*
import kotlinx.android.synthetic.main.fragment_leave_balance.toolbar
import kotlinx.android.synthetic.main.fragment_setting.*
import kotlinx.android.synthetic.main.fragment_setting.view.*


class FragmentLeaveBalance : Fragment() {

    lateinit var leaveBalanceAdapter: LeaveBalanceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leave_balance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        toolbar.setupWithNavController(navController)

        val dividerItemDecoration = DividerItemDecoration(rvLeaveBalance.context, DividerItemDecoration.VERTICAL)
        leaveBalanceAdapter = LeaveBalanceAdapter()
        rvLeaveBalance.adapter = leaveBalanceAdapter
        rvLeaveBalance.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rvLeaveBalance.addItemDecoration(dividerItemDecoration)

    }

}