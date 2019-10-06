package com.example.myapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.animal_list_item.view.*

class ViewHolder (view: View): RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvAnimalType = view.tv_animal_type
}