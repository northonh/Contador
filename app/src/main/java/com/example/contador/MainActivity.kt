package com.example.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button
    private lateinit var contadorTv: TextView
    private lateinit var inicialEt: EditText
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contadorTv = findViewById(R.id.contadorTv)
        cliqueBt = findViewById(R.id.cliqueBt)
        inicialEt = findViewById(R.id.inicialEt)

        // Listener no modo Java
/*        inicialEt.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // Não utilizado
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Não utilizado
            }

            override fun afterTextChanged(s: Editable?) {
                // Perceba que deixar o EditText vazio gera exceção NumberFormatException, mas não estamos fazendo validações.
                contador = s.toString().toInt()
            }
        })*/

        // Listener no modo Kotlin usando função afterTextChanged
        // Perceba que deixar o EditText vazio gera exceção NumberFormatException, mas não estamos fazendo validações.
        inicialEt.addTextChangedListener { text -> contador = text.toString().toInt() }

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