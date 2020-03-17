package com.myhome.viewpagersample

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.myhome.siviewpager.SIPagerAdapter
import kotlinx.android.synthetic.main.pager_item.view.*

class MyPagerAdapter(context:Context): SIPagerAdapter() {
    val context = context
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = LayoutInflater.from(context).inflate(R.layout.pager_item, container, false)
        view.my_image.setImageResource(items.get(position) as Int)
        view.setTag(position)
        container.addView(view)
        view.remove_bt.setOnClickListener {
            removeAt(position)
        }
        return view
    }
}