package com.example.colorapp

/*
    Para usar diversas cores nos nossos apps usamos a nossa pasta de recursos,
    onde na subpasta values encontramos nosso arquivo de cores com diversas cores,
    e onde podemos adcionar varias cores.
*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // tambem e possivel setar cores em nosso codigo
        // koltin
        val cor_verde: Int = resources.getColor(R.color.verde_meu)
    }
}