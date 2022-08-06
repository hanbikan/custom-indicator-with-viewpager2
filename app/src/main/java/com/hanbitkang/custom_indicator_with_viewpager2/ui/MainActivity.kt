package com.hanbitkang.custom_indicator_with_viewpager2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hanbitkang.custom_indicator_with_viewpager2.R
import com.hanbitkang.custom_indicator_with_viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        binding.viewPager2.let {
            it.adapter = PageViewPagerAdapter(this)
        }
    }
}