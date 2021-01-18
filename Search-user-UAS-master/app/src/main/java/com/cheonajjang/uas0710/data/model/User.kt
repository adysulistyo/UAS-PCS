package com.cheonajjang.uas0710.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(
    val login : String,
    val id : Int,
    val avatar_url : String,
    val html_url : String
): Parcelable
