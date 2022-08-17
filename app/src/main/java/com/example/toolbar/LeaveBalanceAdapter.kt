package com.example.toolbar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LeaveBalanceAdapter : RecyclerView.Adapter<LeaveBalanceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeaveBalanceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_leavebalance, parent, false)
        return LeaveBalanceViewHolder(view)
    }

    override fun onBindViewHolder(holder: LeaveBalanceViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }

}