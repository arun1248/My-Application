package com.nilan.tech.myapplication.jewelApp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.ActivityBillBinding
import com.nilan.tech.myapplication.databinding.ActivityJewelBinding

class BillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityBillBinding = DataBindingUtil.setContentView(this, R.layout.activity_bill)

        val name = intent.getStringExtra("EXTRA_NAME") ?: "unknown"
        val weight = intent.getDoubleExtra("EXTRA_WEIGHT",0.0)

        binding.tvItemName.text = name
        binding.tvWeight.setText(weight.toString())

        binding.btn.setOnClickListener {
            val price = binding.tvPrice.text.toString().toDouble()
            val tax = binding.tvTax.text.toString().toDouble()
            val weightEdited = binding.tvWeight.text.toString().toDouble()

            val priceCalc = price * weightEdited
            val taxCalc = priceCalc * tax / 100
            val total = priceCalc + taxCalc

            binding.tvTotal.text = total.toString()
        }
    }
}