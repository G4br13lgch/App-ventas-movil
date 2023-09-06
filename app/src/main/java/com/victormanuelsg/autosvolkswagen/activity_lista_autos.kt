package com.victormanuelsg.autosvolkswagen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.victormanuelsg.autosvolkswagen.Adaptadores.autoAdaptador
import com.victormanuelsg.autosvolkswagen.Modelos.modeloAuto
import kotlinx.android.synthetic.main.activity_lista_autos.*

class activity_lista_autos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_autos)


        //cambio a pantalla 2
        val boton7=findViewById<Button>(R.id.button_InsertAuto)
        boton7.setOnClickListener {
            val cambiopan= Intent(this,activity_registro:: class.java)
            startActivity(cambiopan)
        }





        //se crean autos estaticos
        val listaAutos:ArrayList<modeloAuto> = ArrayList()
        listaAutos.add(modeloAuto("Camaro","2020","Estandar"))
        listaAutos.add(modeloAuto("jetta","2019","Automatico"))
        listaAutos.add(modeloAuto("Juke","2015","Estandar"))
        listaAutos.add(modeloAuto("Camaro","2020","Estandar"))
        listaAutos.add(modeloAuto("jetta","2019","Automatico"))
        listaAutos.add(modeloAuto("Juke","2015","Estandar"))
        listaAutos.add(modeloAuto("Camaro","2020","Estandar"))
        listaAutos.add(modeloAuto("jetta","2019","Automatico"))
        listaAutos.add(modeloAuto("Juke","2015","Estandar"))

        recyclerViewListaAutos.layoutManager = LinearLayoutManager(this)
        recyclerViewListaAutos.adapter = autoAdaptador(listaAutos, this )

       button_InsertAuto.setOnClickListener {

       }

    }



    private fun chatSelected(auto: modeloAuto){
        val intent = Intent(this, autoAdaptador::class.java)
        intent.putExtra("chatId", auto.nombre)
        intent.putExtra("user", auto.modelo)
        startActivity(intent)
    }









}