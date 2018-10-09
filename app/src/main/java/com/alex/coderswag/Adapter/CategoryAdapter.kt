package com.alex.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.alex.coderswag.Model.Category
import com.alex.coderswag.R

class CategoryAdapter (context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView : View
        // Create and instance of our private class ViewHolder
        val holder: ViewHolder

        // RecycleView happens here. If not null then create if exists then go to else {use created views}
        if(convertView == null){
            // Inflater connects layout xml file with view
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            // tag is set unique value to categoryView which is Holder
            categoryView.tag = holder
        } else {
            // Reusing cells of our Holder views
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return  categories.count()
    }

    // This class holds the references to our elements (image and textName).
    // ViewHolder pattern - we need that for recycle views
    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}