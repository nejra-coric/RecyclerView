package com.example.recyclerview

import android.annotation.SuppressLint
import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnClickListener {
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = listOf(
            Item("Item 1", "Description 1"),
            Item("Item 2", "Description 2"),
            Item("Item 3", "Description 3")
        )
        val adapter = MenuAdapter(itemList,this)
        val recyclerView: RecyclerView = findViewById(R.id.rv_menu_list)

        recyclerView.adapter = adapter

        adapter.notifyDataSetChanged()
        //kada je update lista
    }

    override fun onRowClick(item: Item) {
        Toast.makeText(this,item.name,Toast.LENGTH_SHORT).show()
    }
}