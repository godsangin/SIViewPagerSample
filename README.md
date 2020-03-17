# SIViewPagerSample
Sample application using SIViewPager

## SIViewPager
- [SIViewPager link](https://github.com/godsangin/SIViewPager)


### essential code
```
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

```

```
val siPagerAdapter = MyPagerAdapter(applicationContext)
...
siViewpager.build(siPagerAdapter)
```
