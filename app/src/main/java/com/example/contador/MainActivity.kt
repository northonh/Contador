package com.example.contador

import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.example.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        // Listener no modo Kotlin
        // Observe o casting usando o operador as
        amb.inicialCb.setOnClickListener { contador = (it as CheckBox).text.toString().toInt() }

        // Listener no modo Kotlin
        amb.cliqueBt.setOnClickListener { amb.contadorTv.text = (++contador).toString() }
    }
}