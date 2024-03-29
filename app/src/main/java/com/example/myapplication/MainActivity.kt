package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


//https://android.jlelse.eu/using-recyclerview-in-android-kotlin-722991e86bf3
//create linear layout + use recycle view

class MainActivity : AppCompatActivity() {


    // TODO : set up searchView

    val animals: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addAnimals()

        //create a vertical Layout Manager
//        rv_animal_list.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
        rv_animal_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        rv_animal_list.adapter = AnimalAdapter(animals, this)
    }

    fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
//        animals.add("cheetah")
//        animals.add("raccoon")
//        animals.add("bird")
//        animals.add("snake")
//        animals.add("lizard")
//        animals.add("hamster")
//        animals.add("bear")
//        animals.add("lion")
//        animals.add("tiger")
//        animals.add("horse")
//        animals.add("frog")
//        animals.add("fish")
//        animals.add("shark")
//        animals.add("turtle")
//        animals.add("elephant")
//        animals.add("cow")
//        animals.add("beaver")
//        animals.add("bison")
//        animals.add("porcupine")
//        animals.add("rat")
//        animals.add("mouse")
//        animals.add("goose")
//        animals.add("deer")
//        animals.add("fox")
//        animals.add("moose")
//        animals.add("buffalo")
//        animals.add("monkey")
//        animals.add("penguin")
//        animals.add("parrot")
    }
}
