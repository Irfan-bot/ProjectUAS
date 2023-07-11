package com.mirfansapplication.app.modules.androidlargeone.`data`.model

import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_levelup_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileGame: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_game)

)
