package com.example.retrofitapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitapp.databinding.PostsItemBinding
import com.example.retrofitapp.models.PostsModel

class PostsDiffUtil : DiffUtil.ItemCallback<PostsModel>() {
    override fun areItemsTheSame(oldItem: PostsModel, newItem: PostsModel): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: PostsModel, newItem: PostsModel): Boolean {
        return oldItem == newItem
    }
}

class PostsAdapter() : ListAdapter<PostsModel, PostsAdapter.MyViewHolder>(PostsDiffUtil()) {
    inner class MyViewHolder(val binding: PostsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(post: PostsModel) {
            binding.name.text = post.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = PostsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}