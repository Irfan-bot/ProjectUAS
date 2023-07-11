package com.mirfansapplication.app.modules.androidlargefour.`data`.model

import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeFourModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_levelup_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUSERID: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleThirtySevenValue: String? = null
)
