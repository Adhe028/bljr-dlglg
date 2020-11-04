package com.example.resikelview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Ade",
        "Dimas",
        "Rani",
        "Zulfa",
        "Lilis",
        "Budy",
        "Yayang",
        "Sepul",
        "Yanuar",
        "Ipam",
        "Jefri",
        "Bagus"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size){
            list.add(Users(listUsers.get(i)))
            if (listUsers.size -1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
            }
        }
    }
}