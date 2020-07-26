package com.example.sampleunittesting.utils

import android.app.Activity
import android.widget.TextView


class TextUtils {
    fun setText(activity: Activity, view: TextView, text: String?) {
        activity.runOnUiThread { view.text = text }
    }
}