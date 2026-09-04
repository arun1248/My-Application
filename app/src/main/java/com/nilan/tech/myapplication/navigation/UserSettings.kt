package com.nilan.tech.myapplication.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserSettings(val settingNameValue: String): Parcelable
