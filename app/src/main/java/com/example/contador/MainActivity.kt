package com.example.contador

import android.os.Bundle
import android.widget.RadioButton
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
        // Para o dezRb foi usado o valor em hardcode, mas zeroRb foi usado o valor de texto do componente
        amb.zeroRb.setOnClickListener { view -> contador = (view as RadioButton).text.toString().toInt() }
        amb.dezRb.setOnClickListener { contador = 10 }

        // Listener no modo Kotlin
        amb.cliqueBt.setOnClickListener { amb.contadorTv.text = (++contador).toString() }
    }
}