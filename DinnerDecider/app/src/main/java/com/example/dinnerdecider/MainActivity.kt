package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.RandomAccess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    val list = arrayListOf<String>("Hamburger", "American", "Chinese","Pakistani","Indian")

    fun decide(view: View) {

        food.text = list.shuffled().take(1)[0]
    }

    fun addF(view: View) {
        food.text = newF.text
        list.add(newF.text.toString())
    }

}
