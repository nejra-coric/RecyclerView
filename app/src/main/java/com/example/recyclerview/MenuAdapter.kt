package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

interface OnClickListener{
    fun onRowClick(item:Item)
}
class MenuAdapter(
    private val items: List<Item>,
    private val onClickListener: OnClickListener
    ): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.text1.text = currentItem.name
        holder.text2.text = currentItem.description

        holder.text2.setOnClickListener {
            onClickListener.onRowClick(currentItem)
        }

    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val text1: TextView = itemView.findViewById(R.id.text1)
        val text2: TextView = itemView.findViewById(R.id.text2)
    }


}