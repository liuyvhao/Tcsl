package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_statistic.*

/**
 * 项目统计
 */
class StatisticActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistic)
        initView()
    }

    private fun initView() {
        back.setOnClickListener { finish() }

    }
}
