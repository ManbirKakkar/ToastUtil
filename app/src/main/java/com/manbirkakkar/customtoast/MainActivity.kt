package com.manbirkakkar.customtoast

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.manbirkakkar.customtoast.databinding.ActivityMainBinding
import com.manbirkakkar.customtoastlibrary.ToastMessage

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var binding: ActivityMainBinding? = null
    private val customMessage: String = "Test Message"
    private val toastDuration: Int = 2000 // toast message duration in milliseconds
    private val toastBackgroundColor: Int = Color.RED
    private val toastTextColor: Int = Color.BLACK

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        val view: View = binding!!.root
        setContentView(view)

        binding?.showToast?.setOnClickListener(this)
        binding?.showToastCustomDuration?.setOnClickListener(this)
        binding?.colorChangeToast?.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when(view){
            binding?.showToast -> ToastMessage(this).showToast(customMessage)
            binding?.showToastCustomDuration -> ToastMessage(this).showToast(customMessage, toastDuration)
        }
    }
}