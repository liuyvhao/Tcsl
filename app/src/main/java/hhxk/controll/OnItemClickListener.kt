package hhxk.controll

import android.view.View

interface OnItemClickListener {
    fun onItemClick(view: View, position: Int)

    fun onItemLongClick(view: View, position: Int){}
}