package com.nilan.tech.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private const val TAG = "MainActivityKotlin"

class MainActivityKotlin : AppCompatActivity(), View.OnClickListener {

    lateinit var result: TextView

//    var test = onClick(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)

        result = findViewById(R.id.resTxt)
        result.text = "result is success"

        val btnHello: Button = findViewById(R.id.helloBtn)
        btnHello.setOnClickListener(this)

        val btnBye: Button = findViewById(R.id.byeBtn)
//        btnBye.setOnClickListener(this)
//        btnBye.setOnClickListener(ByeBtn())

//        btnBye.setOnClickListener(ByeBtn2)
//        btnBye.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(p0: View?) {
//
//            }
//        })

//        btnBye.setOnClickListener({ view: View -> Log.d(TAG, "onClick: Bye Bye ") })
//        btnBye.setOnClickListener({ view: View -> Log.d(TAG, "onClick: Bye Bye ") })

        btnBye.setOnClickListener { view -> // optional to have parameter view
            Log.d(TAG, "onClick: Bye lambda without parenthesis")
        }

    }

    override fun onClick(view: View?) {
        Log.d(TAG, "onClick: Hello!, ${result.text}")
    }


}

class ByeBtn : View.OnClickListener {
    override fun onClick(p0: View?) {
        Log.d(TAG, "onClick: Bye class ByeBtn")
    }

}

object ByeBtn2: View.OnClickListener {
    override fun onClick(p0: View?) {
        Log.d(TAG, "onClick: Bye object ByeBtn2")
    }

}
