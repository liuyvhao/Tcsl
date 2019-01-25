package hhxk.insurancefragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hhxk.adapter.ItemDataAdapter
import hhxk.controll.OnItemClickListener
import hhxk.pojo.ItemData
import hhxk.tcsl.R
import kotlinx.android.synthetic.main.fragment_data.view.*
import java.util.ArrayList

/**
 * 工程资料
 */
class DataFragment : Fragment(), OnItemClickListener {
    private var v: View? = null
    private var dataList = ArrayList<ItemData>()
    lateinit var adapter: ItemDataAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_data, container, false)
        initView()
        initData()
        return v
    }

    private fun initView() {
        adapter = ItemDataAdapter(dataList, this)
        v!!.recyclerView.layoutManager = LinearLayoutManager(v!!.context)
        v!!.recyclerView.adapter = adapter
    }

    override fun onItemClick(view: View, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun initData(){
        dataList.clear()
        dataList.add(ItemData("0","https://i03piccdn.sogoucdn.com/e756178a6cc5978d","沈家河水库泄洪房设计图纸.cad","2018-12-22 17:33","700kb"))
        dataList.add(ItemData("0","https://i03piccdn.sogoucdn.com/e756178a6cc5978d","沈家河水库输水塔设计图纸.cad","2018-12-22 17:33","700kb"))
        dataList.add(ItemData("0","https://i03piccdn.sogoucdn.com/e756178a6cc5978d","沈家河水库围堰一期土垒方图纸.cad","2018-12-22 17:33","700kb"))
        dataList.add(ItemData("0","https://i03piccdn.sogoucdn.com/e756178a6cc5978d","关于沈家河水库设计院可行性研究报告.doc","2018-12-22 17:33","700kb"))
        dataList.add(ItemData("0","https://i03piccdn.sogoucdn.com/e756178a6cc5978d","沈家河水库机电工程设计方案.pdf","2018-12-22 17:33","700kb"))
        adapter.notifyDataSetChanged()
    }
}