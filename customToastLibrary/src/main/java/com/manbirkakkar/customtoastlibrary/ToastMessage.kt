package com.manbirkakkar.customtoastlibrary

import android.content.Context
import android.widget.Toast


class ToastMessage(private val context: Context) {

    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showToast(message: String, duration: Int) {
        Toast.makeText(context, message, duration).show()
    }

}