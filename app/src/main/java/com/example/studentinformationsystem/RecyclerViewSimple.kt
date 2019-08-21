package com.example.studentinformationsystem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout


class RecyclerViewSimple : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_simple)

       val recyclerView=findViewById<RecyclerView>(R.id.recycle)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val users= ArrayList<RecyclerUser>()
        users.add(RecyclerUser("Qasim cheema","Department,BS-iT 16"))
        users.add(RecyclerUser("Umer","Department,BS-Zoology "))
        users.add(RecyclerUser("Ali","Department,BS-English "))
        users.add(RecyclerUser("Qadeer","Department,BS-Mathematics "))
        users.add(RecyclerUser("WaQar","Department,BS-Software Engineering "))
        users.add(RecyclerUser("Amir","Department,BS-DP"))
        users.add(RecyclerUser("Tanveer","Department,BS-BBA"))
        users.add(RecyclerUser("Qasim cheema","Department,BS-Political Science"))
        users.add(RecyclerUser("Ahmed","Department,BS-CS"))


        val adapter = CustomAdapter(users)
        recyclerView.adapter = adapter


    }
}
