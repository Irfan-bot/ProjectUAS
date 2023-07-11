package com.mirfansapplication.app.modules.androidlargeone.`data`.model

import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GridfifacounterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFifaCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_fifa_23)

)
