package com.mirfansapplication.app.modules.androidlargeone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.base.BaseActivity
import com.mirfansapplication.app.databinding.ActivityAndroidLargeOneBinding
import com.mirfansapplication.app.modules.androidlargeone.`data`.model.GridfifacounterRowModel
import com.mirfansapplication.app.modules.androidlargeone.`data`.viewmodel.AndroidLargeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargeOneActivity :
    BaseActivity<ActivityAndroidLargeOneBinding>(R.layout.activity_android_large_one) {
  private val viewModel: AndroidLargeOneVM by viewModels<AndroidLargeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridfifacounterAdapter =
    GridfifacounterAdapter(viewModel.gridfifacounterList.value?:mutableListOf())
    binding.recyclerGridfifacounter.adapter = gridfifacounterAdapter
    gridfifacounterAdapter.setOnItemClickListener(
    object : GridfifacounterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridfifacounterRowModel) {
        onClickRecyclerGridfifacounter(view, position, item)
      }
    }
    )
    viewModel.gridfifacounterList.observe(this) {
      gridfifacounterAdapter.updateData(it)
    }
    binding.androidLargeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridfifacounter(
    view: View,
    position: Int,
    item: GridfifacounterRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
