package com.victormanuelsg.autosvolkswagen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activity_comenzar : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comenzar)

 // cambio a pantalla lista autos
        val boton2=findViewById<Button>(R.id.button2)
        boton2.setOnClickListener {
            val cambio= Intent(this,activity_lista_autos:: class.java)
            startActivity(cambio)
        }





    }
}