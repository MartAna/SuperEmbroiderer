package com.example.superembroiderer

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LevelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(level: Level) {

        val pictureImageView: ImageView = itemView.findViewById(R.id.image_view)
        val levelTextView: TextView = itemView.findViewById(R.id.level_view)
        val purposeTextView: TextView = itemView.findViewById(R.id.purpose_view)
        pictureImageView.setImageDrawable(itemView.context.getDrawable(level.picture))
        levelTextView.text = level.level
        purposeTextView.text = level.purpose.toString()

    }
}