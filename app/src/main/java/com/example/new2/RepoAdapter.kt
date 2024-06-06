package com.example.new2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RepoAdapter(private val repos: List<Repository>) : RecyclerView.Adapter<RepoAdapter.RepoViewHolder>() {
    class RepoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val repoName: TextView = view.findViewById(R.id.repo_name)
        val repoDescription: TextView = view.findViewById(R.id.repo_description)
        val ownerName: TextView = view.findViewById(R.id.owner_name)
        val ownerAvatar: ImageView = view.findViewById(R.id.owner_avatar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.repo_item, parent, false)
        return RepoViewHolder(view)
    }

    override fun onBindViewHolder(holder: RepoViewHolder, position: Int) {
        val repo = repos[position]
        holder.repoName.text = repo.name
        holder.repoDescription.text = repo.description
        holder.ownerName.text = repo.owner.login
        Glide.with(holder.ownerAvatar.context).load(repo.owner.avatar_url).into(holder.ownerAvatar)
    }

    override fun getItemCount() = repos.size
}