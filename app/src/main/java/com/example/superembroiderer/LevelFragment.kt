package com.example.superembroiderer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class LevelFragment : Fragment() {
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_level, container, false)
            val levelList: List<Level> = listOf(
                Level(R.drawable.beginner, "Beginner", 5000),
                Level(R.drawable.promising, "Promising", 12000),
                Level(R.drawable.unstoppable, "Unstoppable", 17000),

                )

            val levelRecyclerView: RecyclerView = view.findViewById(R.id.level_recycler_view)
            levelRecyclerView.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            levelRecyclerView.addItemDecoration(
                DividerItemDecoration(
                    context,
                    DividerItemDecoration.VERTICAL
                )
            )

            levelRecyclerView.adapter = LevelAdapter(levelList)

            return view

    }
}