package com.nilan.tech.myapplication.recyclerviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.ActivityRecyclerBinding

val cars = listOf(
    Car("Toyota Camry", "White"),
    Car("Honda Civic", "Black"),
    Car("Ford Mustang", "Red"),
    Car("BMW 3 Series", "Blue"),
    Car("Audi A4", "Grey"),
    Car("Mercedes C-Class", "Silver"),
    Car("Tesla Model 3", "White"),
    Car("Hyundai Elantra", "Blue"),
    Car("Kia Seltos", "Black"),
    Car("Volkswagen Golf", "Red"),
    Car("Nissan Altima", "Grey"),
    Car("Mazda CX-5", "White"),
    Car("Chevrolet Camaro", "Yellow"),
    Car("Porsche 911", "Black"),
    Car("Lexus ES", "Silver"),
    Car("Volvo XC60", "Green"),
    Car("Jeep Wrangler", "Orange"),
    Car("Skoda Octavia", "Blue"),
    Car("Renault Duster", "Brown"),
    Car("Tata Nexon", "Red")
)

class RecyclerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityRecyclerBinding = DataBindingUtil.setContentView(this, R.layout.activity_recycler)

//        binding.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        binding.rvList.adapter = ListAdapterRV(listOf(1,2,3,4,5,6,7,8,9,10))
//        binding.rvList.adapter = ListAdapterRVNumbers(IntRange(0, 100).toList())

        binding.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvList.adapter = ListAdapterRVCars(cars + cars)
    }

}