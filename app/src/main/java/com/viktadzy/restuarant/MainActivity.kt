package com.viktadzy.restuarant

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.GridView

class MainActivity : AppCompatActivity() {

    val adapter:FoodAdapter?=null
    val listOfFoods= ArrayList<Foods>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //load foods
        listOfFoods.add(Foods("Chicken","Chicken is dip fried..................",R.drawable.chicken))
        listOfFoods.add(Foods("Coffee","Coffee is boiled..................",R.drawable.coffee_pot))
        listOfFoods.add(Foods("Espresso","Espresso is made..................",R.drawable.espresso))
        listOfFoods.add(Foods("Pizza","Pizza preparation..................",R.drawable.pizzar))
        listOfFoods.add(Foods("Rollex","Rollex is rolled chappati with eggs..................",R.drawable.rollex))
        adapter =FoodAdapter(this,listOfFoods)
        //assign our list to our gridview id
        findViewById<GridView>(R.id.gvfoodlist).adapter=adapter
    }

    class FoodAdapter:BaseAdapter {
        var listOfFoods = ArrayList<Foods>()
        var context: Context? = null

        constructor(context: Context, listOfFoods: ArrayList<Foods>) : super() {


            this.context = context
            this.listOfFoods = listOfFoods
        }
    }


}