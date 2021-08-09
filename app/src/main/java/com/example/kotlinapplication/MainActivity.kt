package com.example.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener{
            val result = etVar1.text.toString().toInt() + etVar2.text.toString().toInt()
            tvResult.text = result.toString()
        }

        btnMulti.setOnClickListener{
            val result = etVar1.text.toString().toInt() * etVar2.text.toString().toInt()
            tvResult.text = result.toString()
        }

        btnSub.setOnClickListener{
            val result = etVar1.text.toString().toInt() - etVar2.text.toString().toInt()
            tvResult.text = result.toString()
        }

        btnDivide.setOnClickListener{
            val result = etVar1.text.toString().toInt() / etVar2.text.toString().toInt()
            tvResult.text = result.toString()
        }
    }
}