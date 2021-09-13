package com.example.imc20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editPeso = findViewById<EditText>(R.id.edit_peso)
        val editAltura = findViewById<EditText>(R.id.edit_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)
        val textViewResultado = findViewById<TextView>(R.id.text_view_resultado)

        buttonCalcular.setOnClickListener {

            if (editPeso.text.isEmpty()){
                editPeso.error = "Peso é obrigatório!"
            } else if (editAltura.text.isEmpty()){
                editAltura.error = "Altura é obrigatório!"
            } else {

                val peso = editPeso.text.toString().toInt()
                val altura = editAltura.text.toString().toDouble()

                val imc = peso / (altura * altura)

                textViewResultado.text = String.format("%.2f", imc)
            }
        }

    }
}