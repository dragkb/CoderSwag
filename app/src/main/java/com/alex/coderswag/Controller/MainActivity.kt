package com.alex.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.alex.coderswag.Adapter.CategoryRecycleAdapter
import com.alex.coderswag.R
import com.alex.coderswag.Services.DataService
import com.alex.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // adapter is a middle man between data and listViews
    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize an Adapter
        adapter = CategoryRecycleAdapter(this, DataService.categories){category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        // Set the adapter for the ListView itself
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        // Needs only for optimization
        categoryListView.setHasFixedSize(true)
    }
}
