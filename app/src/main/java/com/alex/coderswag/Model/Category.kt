package com.alex.coderswag.Model

class Category (val title: String, val image: String){

    // Override toString to return title in order to display title names in our ListView
    override fun toString(): String {
        return title
    }
}