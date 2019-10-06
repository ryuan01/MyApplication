package com.example.myapplication

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


// Q: what is Context?
// Q: what is ViewHolder?
// Q: structure of RecyclerView?
// Q: what is View?

class AnimalAdapter(val items: ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.animal_list_item_grid,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //TODO: add images too
        Log.d("myTag", "binded: "+items[position])
        holder.tvAnimalType.text = items[position]
    }

}