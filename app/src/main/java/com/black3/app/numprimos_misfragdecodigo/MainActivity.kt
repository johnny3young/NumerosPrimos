package com.black3.app.numprimos_misfragdecodigo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numEvaluar = editText_Numero?.toString()
        val a = 1 + 2
        val b = 4-2
        val c = 10 % 0
        btn_validar.setOnClickListener {
            if (numEvaluar % 2 == 0) {
                println("El número no es primo")
            } else {
                val iterar = numEvaluar + 1
            }
        }


    }

}
