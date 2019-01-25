package hhxk.insurancefragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hhxk.adapter.ItemMainAdapter
import hhxk.controll.OnItemClickListener
import hhxk.pojo.Maintenance
import hhxk.tcsl.R
import kotlinx.android.synthetic.main.fragment_maintenance.view.*
import java.util.ArrayList

/**
 * 维护记录
 */
class MaintenanceFragment : Fragment(), OnItemClickListener {
    private var v: View? = null
    private var maintenanceList = ArrayList<Maintenance>()
    lateinit var adapter: ItemMainAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        v = inflater.inflate(R.layout.fragment_maintenance, container, false)
        initView()
        initData()
        return v
    }

    private fun initView() {
        adapter = ItemMainAdapter(maintenanceList, this)
        v!!.recyclerView.layoutManager = LinearLayoutManager(v!!.context)
        v!!.recyclerView.adapter = adapter
    }

    override fun onItemClick(view: View, position: Int) {

    }

    private fun initData() {
        maintenanceList.clear()
        maintenanceList.add(Maintenance("0", "维养编号 -SP-2365698KK", "1.5", "2017-10-22~2019-01-18", "工程养护"))
        maintenanceList.add(Maintenance("0", "维养编号 -SP-2365698KK", "1.5", "2017-10-22~2019-01-18", "工程养护"))
        maintenanceList.add(Maintenance("0", "维养编号 -SP-2365698KK", "1.5", "2017-10-22~2019-01-18", "工程养护"))
        maintenanceList.add(Maintenance("0", "维养编号 -SP-2365698KK", "1.5", "2017-10-22~2019-01-18", "工程养护"))
        maintenanceList.add(Maintenance("0", "维养编号 -SP-2365698KK", "1.5", "2017-10-22~2019-01-18", "工程养护"))
        adapter.notifyDataSetChanged()
    }
}