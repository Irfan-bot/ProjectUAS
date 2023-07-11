package com.mirfansapplication.app.modules.androidlargefour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mirfansapplication.app.modules.androidlargefour.`data`.model.AndroidLargeFourModel
import com.mirfansapplication.app.modules.androidlargefour.`data`.model.GriduccounterRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AndroidLargeFourVM : ViewModel(), KoinComponent {
  val androidLargeFourModel: MutableLiveData<AndroidLargeFourModel> =
      MutableLiveData(AndroidLargeFourModel())

  var navArguments: Bundle? = null

  val griduccounterList: MutableLiveData<MutableList<GriduccounterRowModel>> =
      MutableLiveData(mutableListOf())
}
