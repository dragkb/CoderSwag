package com.alex.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alex.coderswag.Adapter.CategoryAdapter
import com.alex.coderswag.R
import com.alex.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // adapter is a middle man between data and listViews
    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize an Adapter
        adapter = CategoryAdapter(this, DataService.categories)
        // Set the adapter for the ListView itself
        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener{ adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clicked on ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
    }
}
