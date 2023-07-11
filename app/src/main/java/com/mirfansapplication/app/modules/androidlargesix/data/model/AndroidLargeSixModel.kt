package com.mirfansapplication.app.modules.androidlargesix.`data`.model

import com.mirfansapplication.app.R
import com.mirfansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AndroidLargeSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPembayaranBerh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pembayaran_berh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPesananakanse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pesanan_akan_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJumlahPembayar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jumlah_pembayar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRp50000: String? = MyApp.getInstance().resources.getString(R.string.lbl_rp50_000)

)
