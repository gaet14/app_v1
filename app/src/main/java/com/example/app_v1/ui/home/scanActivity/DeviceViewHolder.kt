package com.example.app_v1.ui.home.scanActivity

import android.view.View
import android.widget.TextView
import com.afollestad.recyclical.ViewHolder
import com.example.app_v1.R

class DeviceViewHolder(itemView: View) : ViewHolder(itemView) {
    val name: TextView = itemView.findViewById(R.id.title)
}