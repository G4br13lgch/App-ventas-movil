package com.victormanuelsg.autosvolkswagen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_insert_auto.*

class insert_auto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_auto)

        var list_of_items_colores = arrayOf("Negro", "Blanco", "Rojo")
        var list_of_items_transmisiones = arrayOf("Automatico", "Standard")
        var list_of_items_traccion = arrayOf("Delantera", "Trasera")
        var list_of_items_tipocombustible = arrayOf("Gasolina", "Diesel","Electrico")
        var list_of_items_anos = arrayOf("2010", "2011", "2012", "2013", "2014", "2015", "2016","2017","2018","2019","2020",
            "2021","2022","2023")


       // val arrayAdapter = ArrayAdapter<String>(this,spinnerColor,list_of_items_colores)
         spinnerColor.adapter = ArrayAdapter(this,R.layout.activity_insert_auto,list_of_items_colores)
        spinnerColor.onItemSelectedListener


    }
}