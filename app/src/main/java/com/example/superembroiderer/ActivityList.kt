package com.example.superembroiderer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val levelList: List<Level> = listOf(
            Level(R.drawable.beginner, "Beginner", 5000),
            Level(R.drawable.promising,"Promising" , 12000),
            Level(R.drawable.unstoppable,"Unstoppable" , 17000),

        )

        val usersRecyclerView: RecyclerView = findViewById(R.id.level_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        usersRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )

        usersRecyclerView.adapter = LevelAdapter(levelList)
    }
}