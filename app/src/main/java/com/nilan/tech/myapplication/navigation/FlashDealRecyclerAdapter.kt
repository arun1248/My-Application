package com.nilan.tech.myapplication.navigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil3.load
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.FlashDealItemBinding

class FlashDealRecyclerAdapter(
    private val items: List<Product>
) : RecyclerView.Adapter<FlashDealRecyclerAdapter.ViewHolder>() {

    class ViewHolder(val binding: FlashDealItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        val text: TextView = view.findViewById(R.id.catText)
//        val image: ImageView = view.findViewById(R.id.catImg)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val binding = FlashDealItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.binding.catText.text = items[position].name
        holder.binding.catImg.load(items[position].image)

        holder.binding.heartImg.setOnClickListener {
            items[position].isFavorite = !items[position].isFavorite
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int = items.size
}