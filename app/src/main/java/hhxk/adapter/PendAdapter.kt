package hhxk.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hhxk.controll.OnItemClickListener
import hhxk.pojo.Pend
import hhxk.tcsl.R
import kotlinx.android.synthetic.main.item_pend.view.*
import java.util.ArrayList

class PendAdapter(var pendList: ArrayList<Pend>, var mOnItemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<PendAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PendAdapter.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_pend, parent, false
        )
    )

    override fun getItemCount() = pendList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.title.text = pendList[position].title
        holder.itemView.name.text = "申请人：${pendList[position].name}"
        holder.itemView.time.text = "申请日期：${pendList[position].time}"
        holder.itemView.money.text = "申请金额：${pendList[position].money}万元"
        holder.itemView.address.text = "归属项目：${pendList[position].address}"
        holder.itemView.type.text=pendList[position].type

        holder.itemView.setOnClickListener {
            var position = holder.layoutPosition
            mOnItemClickListener.onItemClick(holder.itemView, position)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}