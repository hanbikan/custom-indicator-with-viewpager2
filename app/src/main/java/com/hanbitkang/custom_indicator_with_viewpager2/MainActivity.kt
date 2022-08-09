package com.hanbitkang.custom_indicator_with_viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hanbitkang.custom_indicator_with_viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewPager2.let {
            it.adapter = PageViewPagerAdapter(this)
            binding.customIndicator.setupViewPager2(it, it.currentItem)
        }
    }
}