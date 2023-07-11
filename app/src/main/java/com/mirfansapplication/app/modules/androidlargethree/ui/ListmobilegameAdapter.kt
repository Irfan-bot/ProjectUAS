package com.mirfansapplication.app.modules.androidlargethree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mirfansapplication.app.R
import com.mirfansapplication.app.databinding.RowListmobilegameBinding
import com.mirfansapplication.app.modules.androidlargethree.`data`.model.ListmobilegameRowModel
import kotlin.Int
import kotlin.collections.List

class ListmobilegameAdapter(
  var list: List<ListmobilegameRowModel>
) : RecyclerView.Adapter<ListmobilegameAdapter.RowListmobilegameVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmobilegameVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmobilegame,parent,false)
    return RowListmobilegameVH(view)
  }

  override fun onBindViewHolder(holder: RowListmobilegameVH, position: Int) {
    val listmobilegameRowModel = ListmobilegameRowModel()
    // TODO uncomment following line after integration with data source
    // val listmobilegameRowModel = list[position]
    holder.binding.listmobilegameRowModel = listmobilegameRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmobilegameRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListmobilegameRowModel
    ) {
    }
  }

  inner class RowListmobilegameVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmobilegameBinding = RowListmobilegameBinding.bind(itemView)
    init {
      binding.btnLihatSemua.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListmobilegameRowModel())
      }
    }
  }
}
