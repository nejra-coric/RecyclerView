package com.example.recyclerview

import android.annotation.SuppressLint
import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = listOf(
            Item("Item 1", "Description 1"),
            Item("Item 2", "Description 2"),
            Item("Item 3", "Description 3")
        )
        val adapter = MenuAdapter(itemList)
        val recyclerView: RecyclerView = findViewById(R.id.rv_menu_list)

        recyclerView.adapter = adapter

        adapter.notifyDataSetChanged()
        //kada je update lista
    }
}