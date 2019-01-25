package hhxk.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hhxk.controll.OnItemClickListener
import hhxk.pojo.Maintenance
import hhxk.tcsl.R
import kotlinx.android.synthetic.main.item_item_maintenance.view.*
import java.util.ArrayList

class ItemMainAdapter(var maintenanceList: ArrayList<Maintenance>, var mOnItemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<ItemMainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemMainAdapter.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_item_maintenance, parent, false
        )
    )

    override fun getItemCount() = maintenanceList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.title.text = maintenanceList[position].title
        holder.itemView.type.text = maintenanceList[position].type
        holder.itemView.money.text = "申请金额：${maintenanceList[position].money}万元"
        holder.itemView.time.text = "维养日期：${maintenanceList[position].time}"

        holder.itemView.setOnClickListener {
            var position = holder.layoutPosition
            mOnItemClickListener.onItemClick(holder.itemView, position)
        }
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}