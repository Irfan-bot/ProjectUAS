package com.mirfansapplication.app.modules.androidlargefive.`data`.model

import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_levelup_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
