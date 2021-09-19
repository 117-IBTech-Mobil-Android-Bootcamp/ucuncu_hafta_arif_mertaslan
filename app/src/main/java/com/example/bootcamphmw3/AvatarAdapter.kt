package com.example.bootcamphmw3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bootcamphmw3.databinding.AvatarItemBinding

class AvatarAdapter(private val data: ArrayList<AvatarModel>) :
    RecyclerView.Adapter<AvatarAdapter.AvatarViewHolder>() {

    class AvatarViewHolder(private var binding: AvatarItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: AvatarModel) {
            binding.avatarImage.setImageResource(item.avatarId)
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AvatarViewHolder {
        return AvatarViewHolder(AvatarItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: AvatarViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}