package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_capital.*

/**
 * 资金统计
 */
class CapitalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capital)
        initView()
    }

    private fun initView(){
        back.setOnClickListener { finish() }
    }
}
