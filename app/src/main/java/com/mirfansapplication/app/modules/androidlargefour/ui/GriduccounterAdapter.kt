package com.mirfansapplication.app.modules.androidlargefour.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mirfansapplication.app.R
import com.mirfansapplication.app.databinding.RowGriduccounterBinding
import com.mirfansapplication.app.modules.androidlargefour.`data`.model.GriduccounterRowModel
import kotlin.Int
import kotlin.collections.List

class GriduccounterAdapter(
  var list: List<GriduccounterRowModel>
) : RecyclerView.Adapter<GriduccounterAdapter.RowGriduccounterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGriduccounterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_griduccounter,parent,false)
    return RowGriduccounterVH(view)
  }

  override fun onBindViewHolder(holder: RowGriduccounterVH, position: Int) {
    val griduccounterRowModel = GriduccounterRowModel()
    // TODO uncomment following line after integration with data source
    // val griduccounterRowModel = list[position]
    holder.binding.griduccounterRowModel = griduccounterRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GriduccounterRowModel>) {
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
      item: GriduccounterRowModel
    ) {
    }
  }

  inner class RowGriduccounterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGriduccounterBinding = RowGriduccounterBinding.bind(itemView)
  }
}
