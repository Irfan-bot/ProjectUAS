package com.mirfansapplication.app.modules.androidlargefour.`data`.model

import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GriduccounterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUcCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_70_uc)

)
