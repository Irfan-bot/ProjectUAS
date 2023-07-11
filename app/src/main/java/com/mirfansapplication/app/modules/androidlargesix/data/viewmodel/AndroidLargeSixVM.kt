package com.mirfansapplication.app.modules.androidlargesix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mirfansapplication.app.modules.androidlargesix.`data`.model.AndroidLargeSixModel
import org.koin.core.KoinComponent

class AndroidLargeSixVM : ViewModel(), KoinComponent {
  val androidLargeSixModel: MutableLiveData<AndroidLargeSixModel> =
      MutableLiveData(AndroidLargeSixModel())

  var navArguments: Bundle? = null
}
