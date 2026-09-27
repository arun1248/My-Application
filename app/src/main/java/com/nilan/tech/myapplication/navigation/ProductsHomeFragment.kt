package com.nilan.tech.myapplication.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.nilan.tech.myapplication.R
import com.nilan.tech.myapplication.databinding.FragmentProductsHomeBinding

data class Product(val name: String, val image: Int, var isFavorite: Boolean = false)

class ProductsHomeFragment : Fragment() { // https://dribbble.com/shots/25304102-Ecommerce-App

    lateinit var binding: FragmentProductsHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductsHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val items = listOf(
            "Page 1",
            "Page 2",
            "Page 3"
        )

        binding.viewpagerBanner.adapter = ViewPagerAdapter(items)

        setupDots()

        binding.viewpagerBanner.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {

                override fun onPageSelected(position: Int) {

                    for (i in 0 until binding.dotsLayout.childCount) {
                        binding.dotsLayout.getChildAt(i).isSelected =
                            i == position
                    }
                }
            }
        )

        binding.categoriesRV.adapter = RecyclerAdapter(
            listOf(
                "Mobile",
                "Headphone",
                "Tablets",
                "Laptop",
                "Speakers",
                "More"
            )
        )

        binding.flashDealsRV.layoutManager =
            GridLayoutManager(requireContext(), 1, RecyclerView.HORIZONTAL, false)
        binding.flashDealsRV.adapter = FlashDealRecyclerAdapter(
            listOf(
                Product("Earbuds", R.drawable.earbuds),
                Product("Glass", R.drawable.glass),
                Product("Cream", R.drawable.cream),
                Product("Sent", R.drawable.scent),
                Product("Shoe", R.drawable.shoe),
            )
        )

    }

    private fun setupDots() {

        val dotsLayout = binding.dotsLayout
        val itemCount = binding.viewpagerBanner.adapter?.itemCount ?: return

        dotsLayout.removeAllViews()

        for (i in 0 until itemCount) {

            val dot = View(requireContext())

            val size = 12.dpToPx()

            val params = LinearLayout.LayoutParams(size, size)
            params.setMargins(
                6.dpToPx(),
                0,
                6.dpToPx(),
                0
            )

            dot.layoutParams = params
            dot.background = getDrawable(
                requireContext(),
                R.drawable.dot_selector
            )

            dot.isSelected = i == binding.viewpagerBanner.currentItem

            dotsLayout.addView(dot)
        }
    }

    fun Int.dpToPx(): Int {
        return (this * resources.displayMetrics.density).toInt()
    }
}
