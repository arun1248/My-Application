package com.nilan.tech.myapplication.jewelApp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.recyclerviewsample.Car
import com.nilan.tech.myapplication.recyclerviewsample.CarsViewHolder

class JewelList(val jewels: List<Jewel>, val calc:(item : Int) -> Unit): RecyclerView.Adapter<JewelsViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): JewelsViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.jewel_item, parent, false)
        return JewelsViewHolder(layout)
    }

    override fun onBindViewHolder(
        holder: JewelsViewHolder,
        position: Int
    ) {
        holder.name.text = jewels[position].name
        holder.weight.text = jewels[position].weight.toString()
        holder.jewelView.setOnClickListener { calc(position) }
    }

    override fun getItemCount(): Int = jewels.size


}

class JewelsViewHolder(val jewelView: View): RecyclerView.ViewHolder(jewelView) {
    val name = jewelView.findViewById<TextView>(R.id.jewelName)
    val weight = jewelView.findViewById<TextView>(R.id.jewelWeight)

}