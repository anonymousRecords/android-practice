package com.chapdo.baemin.item

import android.graphics.drawable.Drawable

data class UserData(
    var img : Drawable,
    var store: String,
    var rate: String,
    var tip_price: String,
    val required_time: String,
)
