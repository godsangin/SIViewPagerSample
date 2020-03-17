package com.myhome.viewpagersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.myhome.siviewpager.SIPagerAdapter
import com.myhome.siviewpager.SIViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val siViewpager = findViewById<SIViewPager>(R.id.siviewpager)
        val siPagerAdapter = MyPagerAdapter(applicationContext)
        siPagerAdapter.addItem(R.drawable.ic_android_black_24dp)
        siPagerAdapter.addItem(R.drawable.ic_assignment_black_24dp)
        siViewpager.build(siPagerAdapter)

        add_bt.setOnClickListener {
            if(index % 2 == 0){
                siPagerAdapter.addItem(R.drawable.ic_android_black_24dp)
            }
            else{
                siPagerAdapter.addItem(R.drawable.ic_assignment_black_24dp)
            }
            index++
        }
    }
}
