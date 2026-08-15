package com.nilan.tech.myapplication.recyclerviewsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nilan.tech.myapplication.R

class ListAdapterRVCars(val cars: List<Car>): RecyclerView.Adapter<CarsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarsViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return CarsViewHolder(layout)
    }

    override fun onBindViewHolder(
        holder: CarsViewHolder,
        position: Int
    ) {
        holder.name.text = cars[position].name
        holder.color.text = cars[position].color
    }

    override fun getItemCount() = cars.size
}

class CarsViewHolder(val carView: View): RecyclerView.ViewHolder(carView) {
    val name = carView.findViewById<TextView>(R.id.carName)
    val color = carView.findViewById<TextView>(R.id.carColor)
}
