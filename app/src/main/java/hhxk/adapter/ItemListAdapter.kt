package hhxk.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import hhxk.controll.OnItemClickListener
import hhxk.pojo.Item
import hhxk.tcsl.R
import kotlinx.android.synthetic.main.item_item_list.view.*
import java.util.ArrayList

class ItemListAdapter(var itemList: ArrayList<Item>, var mOnItemClickListener: OnItemClickListener) : RecyclerView.Adapter<ItemListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemListAdapter.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_item_list, parent, false
        )
    )

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.img.setImageURI(itemList[position].img)
        holder.itemView.title.text = itemList[position].title
        holder.itemView.number.text = itemList[position].number
        holder.itemView.type.text = itemList[position].type
        holder.itemView.status.text = itemList[position].status
        holder.itemView.time.text = itemList[position].time
        holder.itemView.setOnClickListener {
            var position = holder.layoutPosition
            mOnItemClickListener.onItemClick(holder.itemView, position)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}