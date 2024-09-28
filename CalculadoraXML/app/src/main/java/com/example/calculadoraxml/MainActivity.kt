package com.example.calculadoraxml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val num0 = findViewById<Button>(R.id.button0)
        val num1 = findViewById<Button>(R.id.button1)
        val num2 = findViewById<Button>(R.id.button2)
        val num3 = findViewById<Button>(R.id.button3)
        val num4 = findViewById<Button>(R.id.button4)
        val num5 = findViewById<Button>(R.id.button5)
        val num6 = findViewById<Button>(R.id.button6)
        val num7 = findViewById<Button>(R.id.button7)
        val num8 = findViewById<Button>(R.id.button8)
        val num9 = findViewById<Button>(R.id.button9)
        val btnComa = findViewById<Button>(R.id.buttonComa)
        findViewById<Button>(R.id.buttonIgual)
        findViewById<Button>(R.id.buttonSuma)
        findViewById<Button>(R.id.buttonRestar)
        findViewById<Button>(R.id.buttonMultiplicar)
        findViewById<Button>(R.id.buttonDividir)
        findViewById<Button>(R.id.buttonCompartir)
        val btnAc = findViewById<Button>(R.id.buttonAC)

        num0.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("0")
            })
        }

        num1.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("1")
            })
        }

        num2.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("2")
            })
        }

        num3.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("3")
            })
        }

        num4.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("4")
            })
        }
        num5.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("5")
            })
        }

        num6.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("6")
            })
        }

        num7.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("7")
            })
        }

        num8.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("8")
            })
        }

        num9.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("9")
            })
        }

        btnAc.setOnClickListener{
            editText.setText("")
        }

        btnComa.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append(",")
            })
        }

        num9.setOnClickListener{
            val textoActual = editText.text.toString()
            editText.setText(buildString {
                append(textoActual)
                append("9")
            })
        }
    }
}