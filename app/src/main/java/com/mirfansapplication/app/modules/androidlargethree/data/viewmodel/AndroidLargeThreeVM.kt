package com.mirfansapplication.app.modules.androidlargethree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mirfansapplication.app.modules.androidlargethree.`data`.model.AndroidLargeThreeModel
import com.mirfansapplication.app.modules.androidlargethree.`data`.model.ListmobilegameRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AndroidLargeThreeVM : ViewModel(), KoinComponent {
  val androidLargeThreeModel: MutableLiveData<AndroidLargeThreeModel> =
      MutableLiveData(AndroidLargeThreeModel())

  var navArguments: Bundle? = null

  val listmobilegameList: MutableLiveData<MutableList<ListmobilegameRowModel>> =
      MutableLiveData(mutableListOf())
}
