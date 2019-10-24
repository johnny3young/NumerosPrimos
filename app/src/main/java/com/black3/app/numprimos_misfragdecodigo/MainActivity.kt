package com.black3.app.numprimos_misfragdecodigo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var numeroValidar: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_validar.setOnClickListener {
            numeroValidar = editText_Numero.text.toString().toInt()
            esPrimo(numeroValidar!!)
        }

    }

    fun esPrimo(numeroValidar: Int): Boolean {
        // El 0, 1 y 4 no son primos
        if (numeroValidar == 0 || numeroValidar == 1 || numeroValidar == 4) {
            println("El número $numeroValidar no es Primo")

            return false
        }
        for (x in 2 until numeroValidar / 2) {
            // Si es divisible por cualquiera de estos números, no
            // es primo

            if (numeroValidar % x == 0){
                println("El número $numeroValidar no es Primo")
                return false
            }

        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        println("El número $numeroValidar es Primo")

        return true
    }

}