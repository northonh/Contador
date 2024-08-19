package com.example.contador

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
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
        amb.inicialSp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Assim como o if, o when é uma expression em Kotlin
                // Valores em hardcode usados para fins didáticos e economia de tempo
                contador = when (position) {
                    0 -> 0
                    1 -> 5
                    2 -> 10
                    else -> 0 // Valor padrão, necessário quando when é usado como expression
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Não utilizado
            }
        }

        // Listener no modo Kotlin
        amb.cliqueBt.setOnClickListener { amb.contadorTv.text = (++contador).toString() }
    }
}