package com.mirfansapplication.app.modules.home.`data`.model

import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_levelup_id)

)
