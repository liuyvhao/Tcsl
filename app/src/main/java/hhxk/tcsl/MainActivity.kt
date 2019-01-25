package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

/**
 * 主页
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        center_img.setOnClickListener { startActivity<CenterActivity>() }

        pend.setOnClickListener { startActivity<PendActivity>() }
        approve.setOnClickListener { startActivity<ApproveActivity>() }

        itemInfo.setOnClickListener { startActivity<ItemListActivity>() }
        mapSearch.setOnClickListener { startActivity<MapSearchActivity>() }
        statistic.setOnClickListener { startActivity<StatisticActivity>() }
        capital.setOnClickListener { startActivity<CapitalActivity>() }
    }
}
