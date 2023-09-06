package com.victormanuelsg.autosvolkswagen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        //cambio a pantalla 2
       val boton1=findViewById<Button>(R.id.btninicio)
        boton1.setOnClickListener {
            val cambio= Intent(this,activity_comenzar:: class.java)
        startActivity(cambio)
        }

        //cambio a registro
        val textRegistro=findViewById<TextView>(R.id.textView2)
        textRegistro.setOnClickListener {
            val cambio= Intent(this,activity_registro:: class.java)
            startActivity(cambio)
        }

    }
}