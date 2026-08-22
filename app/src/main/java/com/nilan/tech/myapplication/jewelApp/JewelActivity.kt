package com.nilan.tech.myapplication.jewelApp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.ActivityJewelBinding
import com.nilan.tech.myapplication.databinding.ActivityRecyclerBinding
import com.nilan.tech.myapplication.recyclerviewsample.ListAdapterRVCars
import com.nilan.tech.myapplication.recyclerviewsample.cars
import android.content.Intent
val jewels = listOf(
    Jewel("Simple Gold Ring (Plain Band)", 3.0),
    Jewel("Gold Ring with Small Stone", 4.0),
    Jewel("Thick Gold Ring (Men’s)", 8.0),
    Jewel("Gold Earrings (Small Studs)", 2.0),
    Jewel("Gold Jhumka Earrings (Medium)", 6.0),
    Jewel("Gold Hoop Earrings", 5.0),
    Jewel("Gold Chain (Thin, for Women)", 8.0),
    Jewel("Gold Chain (Medium, for Men)", 15.0),
    Jewel("Gold Chain (Thick, for Men)", 25.0),
    Jewel("Gold Pendant (Small, without chain)", 3.0),
    Jewel("Gold Pendant with Chain (Set)", 12.0),
    Jewel("Gold Necklace (Simple, Short)", 10.0),
    Jewel("Gold Necklace (Design, Medium)", 20.0),
    Jewel("Gold Necklace (Heavy, Bridal Style)", 40.0),
    Jewel("Gold Bangles (Pair, Simple)", 16.0),
    Jewel("Gold Bangles (Pair, Design)", 24.0),
    Jewel("Gold Bracelet (Single, Simple)", 7.0),
    Jewel("Gold Anklet (Pair, Light)", 14.0),
    Jewel("Gold Mangalsutra (Traditional)", 18.0),
    Jewel("Gold Nose Pin (Small)", 1.0)
)
class JewelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityJewelBinding = DataBindingUtil.setContentView(this, R.layout.activity_jewel)

        binding.jewelList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.jewelList.adapter = JewelList(jewels) { itemId ->
            val intent = Intent(this, BillActivity::class.java)
            intent.putExtra("EXTRA_NAME", jewels[itemId].name)
            intent.putExtra("EXTRA_WEIGHT", jewels[itemId].weight)
            startActivity(intent)
        }
    }
}