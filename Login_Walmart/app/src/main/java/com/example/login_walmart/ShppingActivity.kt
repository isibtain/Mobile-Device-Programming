package com.example.login_walmart

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.shopping_activity.*

class ShppingActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_activity)
        val intent = intent
        val output:String = intent.getStringExtra("message").toString()
        textView6.text = "Welcome $output"
    }

    fun electron(view: View) {
        Toast.makeText(this, "You selected Electronics!", Toast.LENGTH_LONG).show()
    }

    fun cloth(view: View) {
        Toast.makeText(this, "You selected Clothing!", Toast.LENGTH_LONG).show()
    }

    fun beauty(view: View) {
        Toast.makeText(this, "You selected beauty!", Toast.LENGTH_LONG).show()
    }

    fun food(view: View) {
        Toast.makeText(this, "You selected Food!", Toast.LENGTH_LONG).show()
    }
}