package com.example.contador

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var amb: ActivityMainBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(amb.root)

        // Listener no modo Kotlin usando função afterTextChanged
        // Perceba que deixar o EditText vazio gera exceção NumberFormatException, mas não estamos fazendo validações.
        amb.inicialEt.addTextChangedListener { text -> contador = text.toString().toInt() }

        // Listener no modo Kotlin
        amb.cliqueBt.setOnClickListener { amb.contadorTv.text = (++contador).toString() }
    }
}