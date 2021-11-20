package com.example.superembroiderer

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.fido.fido2.api.common.RequestOptions

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