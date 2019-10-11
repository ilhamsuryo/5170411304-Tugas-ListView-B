package com.example.listviewicon


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import  kotlinx.android.synthetic.main.activity_main.*
import com.example.listviewicon.ListAdapter as ListAdapter


class MainActivity : AppCompatActivity() {

        val languages = arrayOf<String>("Ruby", "Rails", "Python", "JavaScript", "PHP")

        val description = arrayOf<String>(
            "Ruby is an open source and fully object oriented programming language",
            "Ruby on Rails is a server side web application development framework written in Ruby language",
            "Python is interpreted scripting and object oriented programming language",
            "JavaScript is a object based scripting language",
            "PHP is an interpreted language i.e, there is no need for compilation"
        )

        val imageId = arrayOf<Int>(
            R.mipmap.ruby_logo, R.mipmap.rails_logo, R.mipmap.python_logo,
            R.mipmap.javascript_logo, R.mipmap.php_logo
        )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val ListAdapter = ListAdapter(this, languages, description, imageId)
            list_view.adapter = ListAdapter

            list_view.setOnItemClickListener() { adapterView, view, position, id ->
                val itemAtPos = adapterView.getItemAtPosition(position)
                val itemIdAtPos = adapterView.getItemIdAtPosition(position)
                Toast.makeText(
                    this,
                    "Anda memilih:${languages[position]}", Toast.LENGTH_LONG
                ).show()
            }

        }
    }

