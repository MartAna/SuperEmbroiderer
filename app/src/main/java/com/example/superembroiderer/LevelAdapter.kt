package com.example.superembroiderer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LevelAdapter (private val levelList: List<Level>): RecyclerView.Adapter<LevelViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelViewHolder {
        val levelListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.level_list_item, parent, false)

        return LevelViewHolder(levelListItemView)
    }

    override fun onBindViewHolder(holder: LevelViewHolder, position: Int) {
        val level = levelList[position]
        holder.bind(level)
    }

    override fun getItemCount(): Int {
        return levelList.size
    }
}
