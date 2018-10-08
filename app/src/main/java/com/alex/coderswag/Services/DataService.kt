package com.alex.coderswag.Services

import com.alex.coderswag.Model.Category
import com.alex.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIE", "hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIE", "hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIE", "hoodieimage"),
            Category("HAT", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Balck", "$18", "shirt01"),
            Product("Devslopes Badge Light Grey", "$20", "shirt02"),
            Product("Devslopes Logo Shirt Red", "22", "shirt03"),
            Product("Devslopes Hustle", "$22", "shirt04"),
            Product("Kickflip Studios", "$18", "shirt05")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Grey", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Grey Hoodie", "$28", "hoodie03"),
            Product("Devslopes Black Hoodie", "$32", "hoodie04")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )
}