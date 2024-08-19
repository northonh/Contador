package com.example.contador

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button
    private lateinit var contadorTv: TextView
    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contadorTv = findViewById(R.id.contadorTv)
        cliqueBt = findViewById(R.id.cliqueBt)

        // Listener no modo Java
/*        cliqueBt.setOnClickListener(object: OnClickListener{
            override fun onClick(v: View?) {
                contadorTv.setText((++contador).toString())
            }
        })*/

        // Listener no modo Kotlin
        cliqueBt.setOnClickListener { contadorTv.text = (++contador).toString() }
    }
}