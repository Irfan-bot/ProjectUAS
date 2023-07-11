package com.mirfansapplication.app.modules.androidlargethree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.base.BaseActivity
import com.mirfansapplication.app.databinding.ActivityAndroidLargeThreeBinding
import com.mirfansapplication.app.modules.androidlargeone.ui.AndroidLargeOneActivity
import com.mirfansapplication.app.modules.androidlargethree.`data`.model.ListmobilegameRowModel
import com.mirfansapplication.app.modules.androidlargethree.`data`.viewmodel.AndroidLargeThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AndroidLargeThreeActivity :
    BaseActivity<ActivityAndroidLargeThreeBinding>(R.layout.activity_android_large_three) {
  private val viewModel: AndroidLargeThreeVM by viewModels<AndroidLargeThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmobilegameAdapter =
    ListmobilegameAdapter(viewModel.listmobilegameList.value?:mutableListOf())
    binding.recyclerListmobilegame.adapter = listmobilegameAdapter
    listmobilegameAdapter.setOnItemClickListener(
    object : ListmobilegameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmobilegameRowModel) {
        onClickRecyclerListmobilegame(view, position, item)
      }
    }
    )
    viewModel.listmobilegameList.observe(this) {
      listmobilegameAdapter.updateData(it)
    }
    binding.androidLargeThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmobilegame(
    view: View,
    position: Int,
    item: ListmobilegameRowModel
  ): Unit {
    when(view.id) {
      R.id.btnLihatSemua ->  {
        val destIntent = AndroidLargeOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "ANDROID_LARGE_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AndroidLargeThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
