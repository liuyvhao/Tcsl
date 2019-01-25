package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.androidkun.xtablayout.XTabLayout
import hhxk.adapter.TablayoutAdapter
import hhxk.insurancefragment.DataFragment
import hhxk.insurancefragment.MaintenanceFragment
import hhxk.insurancefragment.NavigationFragment
import hhxk.insurancefragment.OverviewFragment
import kotlinx.android.synthetic.main.activity_item_info.*
import java.util.ArrayList

/**
 * 工程详情
 */
class ItemInfoActivity : AppCompatActivity(), XTabLayout.OnTabSelectedListener {
    private var titles = arrayListOf("工程概况", "工程资料", "维护记录", "地图导航")
    private val fragments = ArrayList<Fragment>()
    private var overviewFragment = OverviewFragment()
    private var dataFragment = DataFragment()
    private var maintenanceFragment = MaintenanceFragment()
    private var navigationFragment = NavigationFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_info)
        initView()
    }

    private fun initView() {
        back.setOnClickListener { finish() }

        for (item in titles)
            tabLayout.addTab(tabLayout.newTab().setText(item))
        tabLayout.setOnTabSelectedListener(this)
        fragments.add(overviewFragment)
        fragments.add(dataFragment)
        fragments.add(maintenanceFragment)
        fragments.add(navigationFragment)

        view_pager.adapter = TablayoutAdapter(supportFragmentManager, fragments, titles)
        tabLayout.setupWithViewPager(view_pager)
    }

    override fun onTabReselected(tab: XTabLayout.Tab?) {
    }

    override fun onTabUnselected(tab: XTabLayout.Tab?) {
    }

    override fun onTabSelected(tab: XTabLayout.Tab?) {
        if (tab != null) view_pager.currentItem = tab.position
    }
}
