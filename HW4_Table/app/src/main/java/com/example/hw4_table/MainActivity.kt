package com.example.hw4_table

import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addF(view: View) {

        // Create a new table row.
        val tableRow = TableRow(getApplicationContext())
// Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)

        tableRow.setLayoutParams(layoutParams)
// add values into row by calling addView()
        val tv0 = TextView(this)
        val tv1 = TextView(this)

        tv0.text = aName.text
        tv1.text = aVersion.text


        tableRow.addView(tv0,0)


        tableRow.addView(tv1,1)


// Finally add the created row row into layout
        androidT.addView(tableRow) // id from Layout_file



    }


}
