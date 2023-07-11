package com.mirfansapplication.app.modules.androidlargetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mirfansapplication.app.modules.androidlargetwo.`data`.model.AndroidLargeTwoModel
import com.mirfansapplication.app.modules.androidlargetwo.`data`.model.Gridfifacounter1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AndroidLargeTwoVM : ViewModel(), KoinComponent {
  val androidLargeTwoModel: MutableLiveData<AndroidLargeTwoModel> =
      MutableLiveData(AndroidLargeTwoModel())

  var navArguments: Bundle? = null

  val gridfifacounterList: MutableLiveData<MutableList<Gridfifacounter1RowModel>> =
      MutableLiveData(mutableListOf())
}
