package com.mirfansapplication.app.modules.androidlargefour.ui

import android.view.View
import androidx.activity.viewModels
import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.base.BaseActivity
import com.mirfansapplication.app.databinding.ActivityAndroidLargeFourBinding
import com.mirfansapplication.app.modules.androidlargefive.ui.AndroidLargeFiveActivity
import com.mirfansapplication.app.modules.androidlargefour.`data`.model.GriduccounterRowModel
import com.mirfansapplication.app.modules.androidlargefour.`data`.viewmodel.AndroidLargeFourVM
import com.mirfansapplication.app.modules.androidlargethree.ui.AndroidLargeThreeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargeFourActivity :
    BaseActivity<ActivityAndroidLargeFourBinding>(R.layout.activity_android_large_four) {
  private val viewModel: AndroidLargeFourVM by viewModels<AndroidLargeFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val griduccounterAdapter =
    GriduccounterAdapter(viewModel.griduccounterList.value?:mutableListOf())
    binding.recyclerGriduccounter.adapter = griduccounterAdapter
    griduccounterAdapter.setOnItemClickListener(
    object : GriduccounterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GriduccounterRowModel) {
        onClickRecyclerGriduccounter(view, position, item)
      }
    }
    )
    viewModel.griduccounterList.observe(this) {
      griduccounterAdapter.updateData(it)
    }
    binding.androidLargeFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStack.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSelanjutnya.setOnClickListener {
      val destIntent = AndroidLargeFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImageFive.setOnClickListener {
      val destIntent = AndroidLargeThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGriduccounter(
    view: View,
    position: Int,
    item: GriduccounterRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_FOUR_ACTIVITY"

  }
}
