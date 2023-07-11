package com.mirfansapplication.app.modules.androidlargetwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mirfansapplication.app.R
import com.mirfansapplication.app.databinding.RowGridfifacounter1Binding
import com.mirfansapplication.app.modules.androidlargetwo.`data`.model.Gridfifacounter1RowModel
import kotlin.Int
import kotlin.collections.List

class GridfifacounterAdapter(
  var list: List<Gridfifacounter1RowModel>
) : RecyclerView.Adapter<GridfifacounterAdapter.RowGridfifacounter1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridfifacounter1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridfifacounter1,parent,false)
    return RowGridfifacounter1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridfifacounter1VH, position: Int) {
    val gridfifacounter1RowModel = Gridfifacounter1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridfifacounter1RowModel = list[position]
    holder.binding.gridfifacounter1RowModel = gridfifacounter1RowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridfifacounter1RowModel>) {
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
      item: Gridfifacounter1RowModel
    ) {
    }
  }

  inner class RowGridfifacounter1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridfifacounter1Binding = RowGridfifacounter1Binding.bind(itemView)
  }
}
