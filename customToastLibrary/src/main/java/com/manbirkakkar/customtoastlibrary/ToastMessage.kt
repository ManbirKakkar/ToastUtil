package com.manbirkakkar.customtoastlibrary

import android.content.Context
import android.graphics.PorterDuff
import android.view.View
import android.widget.TextView
import android.widget.Toast


class ToastMessage(private val context: Context) {

    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showToast(message: String, duration: Int) {
        Toast.makeText(context, message, duration).show()
    }

    /**
     * Show Toast with Custom Background color and text color and custom Duration
     */
    fun showToast(message: String,
                  duration: Int,
                  backgroundColor: Int,
                  textColor: Int) {
        val toast = Toast.makeText(context, message, duration)
        val view: View? = toast.view
        //Gets the actual oval background of the Toast then sets the colour filter
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        //Gets the TextView from the Toast so it can be editted
        val text: TextView? = view?.findViewById(android.R.id.message)
        text?.setTextColor(textColor)
        toast.show()
    }

    /**
     * Show Toast with Custom Background color and text color
     */
    fun showToast(context: Context,
                  message: String,
                  backgroundColor: Int,
                  textColor: Int) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        val view: View? = toast.view
        //Gets the actual oval background of the Toast then sets the colour filter
        view?.background?.setColorFilter(backgroundColor, PorterDuff.Mode.SRC_IN)
        //Gets the TextView from the Toast so it can be editted
        val text: TextView? = view?.findViewById(android.R.id.message)
        text?.setTextColor(textColor)
        toast.show()
    }

}