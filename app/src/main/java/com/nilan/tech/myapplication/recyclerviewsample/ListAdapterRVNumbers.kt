package com.nilan.tech.myapplication.recyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nilan.tech.myapplication.R

class ListAdapterRVNumbers(val data: List<Int>): RecyclerView.Adapter<ListAdapterRVNumbers.ViewHolder>() {
    class ViewHolder(val row: View): RecyclerView.ViewHolder(row) {
        val textView = row.findViewById<TextView>(R.id.number)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListAdapterRVNumbers.ViewHolder {

        val layout = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item,
            parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ListAdapterRVNumbers.ViewHolder, position: Int) {
        holder.textView.text = data[position].toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}