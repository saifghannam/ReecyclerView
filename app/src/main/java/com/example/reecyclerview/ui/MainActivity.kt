package com.example.reecyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.reecyclerview.Adapter.UserResicerView
import com.example.reecyclerview.R
import com.example.reecyclerview.model.User
import com.google.android.material.internal.ToolbarUtils

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    lateinit var editText: EditText
    lateinit var button: Button



    var userList:ArrayList<User> =ArrayList()

    val userRecyclerView:UserResicerView by lazy {
        UserResicerView()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView=findViewById(R.id.Resical_id)
        editText=findViewById(R.id.textView2)
        button=findViewById(R.id.btn_view)


        recyclerView.adapter=userRecyclerView

        button.setOnClickListener {
            userList.add(
                User(
                    editText.text.toString(),
                R.drawable.ic_launcher_background))

            userRecyclerView.setList(userList)

         


            }

          //  editText.setText(userList.toString())

        }



        }

    }
