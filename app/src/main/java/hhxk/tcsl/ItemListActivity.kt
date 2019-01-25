package hhxk.tcsl

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import hhxk.adapter.ItemListAdapter
import hhxk.controll.OnItemClickListener
import hhxk.pojo.Item
import kotlinx.android.synthetic.main.activity_item_list.*
import org.jetbrains.anko.startActivity
import java.util.ArrayList

/**
 * 项目信息
 */
class ItemListActivity : AppCompatActivity(), OnItemClickListener {
    private var itemList = ArrayList<Item>()
    private lateinit var adapter: ItemListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)
        initView()
        initData()
    }

    private fun initView() {
        back.setOnClickListener { finish() }
        adapter = ItemListAdapter(itemList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClick(view: View, position: Int) {
        startActivity<ItemInfoActivity>("id" to itemList[position].id)
    }

    private fun initData() {
        itemList.add(
            Item(
                "0",
                "https://i01piccdn.sogoucdn.com/101dfac737be31ef",
                "铜川耀州区沈家河水库",
                "HX-105060890905606",
                "水库工程",
                "已建成",
                "2017-10-22~2019-01-18"
            )
        )
        itemList.add(
            Item(
                "0",
                "https://i01piccdn.sogoucdn.com/101dfac737be31ef",
                "铜川耀州区沈家河水库",
                "HX-105060890905606",
                "水库工程",
                "已建成",
                "2017-10-22~2019-01-18"
            )
        )
        itemList.add(
            Item(
                "0",
                "https://i01piccdn.sogoucdn.com/101dfac737be31ef",
                "铜川耀州区沈家河水库",
                "HX-105060890905606",
                "水库工程",
                "已建成",
                "2017-10-22~2019-01-18"
            )
        )
        adapter.notifyDataSetChanged()
    }
}
