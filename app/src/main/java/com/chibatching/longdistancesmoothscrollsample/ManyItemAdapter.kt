package com.chibatching.longdistancesmoothscrollsample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.chibatching.longdistancesmoothscrollsample.databinding.ListItemBinding


class ManyItemAdapter : RecyclerView.Adapter<ManyItemAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.position = position
    }

    override fun getItemCount(): Int = 3000

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)
}
