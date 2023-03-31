package com.example.listasandroid18_11.Adapter

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.R
import androidx.recyclerview.widget.RecyclerView



class ItemAdapter (context: Context,
                    private val dataSet: List<String>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder()> {

    class ItemViewHolder( view: View): RecyclerView.ViewHolder(view)
    {
        val textItem = view.findViewById<TextView>(R.id.textItem)
    }

}