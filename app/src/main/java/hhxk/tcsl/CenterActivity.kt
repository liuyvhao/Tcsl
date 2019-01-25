package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_center.*
import org.jetbrains.anko.startActivity

/**
 * 个人中心
 */
class CenterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_center)
        initView()
    }

    private fun initView() {
        back.setOnClickListener { finish() }
    }
}
