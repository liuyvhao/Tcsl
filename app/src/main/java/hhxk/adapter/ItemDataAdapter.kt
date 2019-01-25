package hhxk.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hhxk.controll.OnItemClickListener
import hhxk.pojo.ItemData
import hhxk.tcsl.R
import kotlinx.android.synthetic.main.item_item_data.view.*
import java.util.ArrayList

class ItemDataAdapter(var dataList: ArrayList<ItemData>, var mOnItemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<ItemDataAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemDataAdapter.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_item_data, parent, false
        )
    )

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.img.setImageURI(dataList[position].img)
        holder.itemView.title.text = dataList[position].title
        holder.itemView.time.text = dataList[position].time
        holder.itemView.kb.text = dataList[position].kb

        holder.itemView.setOnClickListener {
            var position = holder.layoutPosition
            mOnItemClickListener.onItemClick(holder.itemView, position)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}