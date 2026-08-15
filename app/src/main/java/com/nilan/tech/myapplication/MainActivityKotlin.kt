package com.nilan.tech.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.IntentSenderRequest
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.nilan.tech.myapplication.databinding.ActivityMainKotlinBinding

private const val TAG = "MainActivityKotlin"

class MainActivityKotlin : AppCompatActivity(), View.OnClickListener {

    lateinit var result: TextView

//    var test = onClick(null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main_kotlin)

        val binding: ActivityMainKotlinBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_kotlin)

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

        binding.textField.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(
                p0: CharSequence?,
                p1: Int,
                p2: Int,
                p3: Int
            ) {

            }

            override fun onTextChanged(
                p0: CharSequence?,
                p1: Int,
                p2: Int,
                p3: Int
            ) {

            }

        })

        binding.buttonAction.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
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
