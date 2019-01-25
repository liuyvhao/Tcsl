package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import hhxk.adapter.PendAdapter
import hhxk.controll.OnItemClickListener
import hhxk.pojo.Pend
import kotlinx.android.synthetic.main.activity_pend.*
import java.util.ArrayList

/**
 * 待审批
 */
class PendActivity : AppCompatActivity(), OnItemClickListener {
    private var pendList = ArrayList<Pend>()
    lateinit var adapter: PendAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pend)
        initView()
        initData()
    }

    private fun initView() {
        back.setOnClickListener { finish() }

        adapter = PendAdapter(pendList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClick(view: View, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun initData() {
        pendList.add(Pend("0", "采购申请审批 -SP-2365698KK", "王大锤", "2018-12-22 17:30", "1.5", "铜川市沈家河水库"))
        pendList.add(Pend("0", "采购申请审批 -SP-2365698KK", "王大锤", "2018-12-22 17:30", "1.5", "铜川市沈家河水库"))
        pendList.add(Pend("0", "采购申请审批 -SP-2365698KK", "王大锤", "2018-12-22 17:30", "1.5", "铜川市沈家河水库"))
        pendList.add(Pend("0", "采购申请审批 -SP-2365698KK", "王大锤", "2018-12-22 17:30", "1.5", "铜川市沈家河水库"))
        adapter.notifyDataSetChanged()
    }
}
