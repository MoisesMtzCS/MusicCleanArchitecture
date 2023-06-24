package com.example.miquinielamx.module.feature_tools.context

import android.content.Context
import android.content.Intent

/* Intent clear TOP, NEW_TASK and CLEAR_TASK flag combinations */
const val INTENT_FLAG_CLEAR: Int =
    Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

/**
 * Starts the new activity instance and clear the top screens.
 */
fun Context.navigateToActivityClearTop(clazz: Class<*>) {
    Intent(this, clazz).let {
        it.addFlags(INTENT_FLAG_CLEAR)
        startActivity(it)
    }
}