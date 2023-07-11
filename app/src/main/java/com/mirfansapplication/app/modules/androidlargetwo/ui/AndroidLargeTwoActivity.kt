package com.mirfansapplication.app.modules.androidlargetwo.ui

import android.view.View
import androidx.activity.viewModels
import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.base.BaseActivity
import com.mirfansapplication.app.databinding.ActivityAndroidLargeTwoBinding
import com.mirfansapplication.app.modules.androidlargetwo.`data`.model.Gridfifacounter1RowModel
import com.mirfansapplication.app.modules.androidlargetwo.`data`.viewmodel.AndroidLargeTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargeTwoActivity :
    BaseActivity<ActivityAndroidLargeTwoBinding>(R.layout.activity_android_large_two) {
  private val viewModel: AndroidLargeTwoVM by viewModels<AndroidLargeTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridfifacounterAdapter =
    GridfifacounterAdapter(viewModel.gridfifacounterList.value?:mutableListOf())
    binding.recyclerGridfifacounter.adapter = gridfifacounterAdapter
    gridfifacounterAdapter.setOnItemClickListener(
    object : GridfifacounterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridfifacounter1RowModel) {
        onClickRecyclerGridfifacounter(view, position, item)
      }
    }
    )
    viewModel.gridfifacounterList.observe(this) {
      gridfifacounterAdapter.updateData(it)
    }
    binding.androidLargeTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridfifacounter(
    view: View,
    position: Int,
    item: Gridfifacounter1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_TWO_ACTIVITY"

  }
}
