package com.alex.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.alex.coderswag.Model.Product
import com.alex.coderswag.R

class ProductsAdapter (val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.products_list_item, parent, false)
        return ProductsHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductsHolder, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    inner class ProductsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val prodcutPrice = itemView?.findViewById<TextView>(R.id.productPrice)

        fun bindProduct(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            prodcutPrice?.text = product.price
        }
    }
}