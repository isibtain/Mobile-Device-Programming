package com.example.login_walmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.singup_activity.*
import user

class MainActivity : AppCompatActivity() {

    var list = ArrayList<user>()//Creating an empty arraylist.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);


        var user1 = user("Ali", "Raza", "aa@a.com", "bb")
        var user2 = user("Adnan", "haider", "ab", "bc")
        var user3 = user("Khan", "akbar", "ac", "bd")
        var user4 = user("Sibtain", "sultan", "ad", "be")
        var user5 = user("Salman", "shah", "ae", "bf")

        list.add(user1)
        list.add(user2)
        list.add(user3)
        list.add(user4)
        list.add(user5)
    }


    fun sign(view: View) {

        var username = email.text.toString()
        var pass = pwd.text.toString()


        for (user in list) {
            if (user.username==username && user.password==pass) {
                Toast.makeText(this, "Hi there! Come in.", Toast.LENGTH_LONG).show()

                var input = username.toString()
                val intent = Intent(this, ShppingActivity::class.java)
                intent.putExtra("message",input);
                startActivity(intent);

                return
            }
            else
                Toast.makeText(this, "Wrong!", Toast.LENGTH_LONG).show()
        }

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

    fun signnup(view: View) {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent);

    }

    fun takeC(view: View) {

        var lasname = lastN.text.toString()
        var firname = frstName.text.toString()
        var emailss = emailUp.text.toString()
        var passs = pwdUp.text.toString()


        var userN = user(lasname, firname, emailss, passs)
        list.add(userN)
        Toast.makeText(this, "Signed Up Successfully.", Toast.LENGTH_LONG).show()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent);

    }


}



