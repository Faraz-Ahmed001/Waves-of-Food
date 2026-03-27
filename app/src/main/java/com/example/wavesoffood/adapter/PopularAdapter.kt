package com.example.wavesoffood.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.PopularItemBinding

class PopularAdapter (private var Item : List<String>, private val Price : List<String>, private val Image : List<Int>) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {
    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): PopularViewHolder {
        return PopularViewHolder(PopularItemBinding.inflate(LayoutInflater.from(p0.context), p0, false))

    }

    override fun onBindViewHolder(
        holder: PopularViewHolder,
        position: Int
    ) {
        val items = Item[position]
        val images = Image[position]
        val prices = Price[position]
        holder.bind(items,prices,images)
    }

    override fun getItemCount(): Int {
        return Item.size
    }

    class PopularViewHolder (val binding: PopularItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.foodPopularImage
        val foodName = binding.foodNamePopular
        val price = binding.pricePopular

        fun bind(items: String, prices: String, images: Int) {
            binding.foodNamePopular.text = items
            binding.pricePopular.text = prices
            binding.foodPopularImage.setImageResource(images)

        }

    }
}