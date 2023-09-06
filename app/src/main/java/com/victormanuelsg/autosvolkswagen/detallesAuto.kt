package com.victormanuelsg.autosvolkswagen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalles_auto.*

class detallesAuto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_auto)
        //Estos datos se reciben de autoAdaptador, al momento de darle click
        //Se guardan en variables para posteriormente insertarlos en los textview de detallesAutos
        var nombre = intent.getStringExtra("nombre")
        var modelo = intent.getStringExtra("modelo")
        var tipo = intent.getStringExtra("tipo")

        //Se insertan las variables en los textView de detallesAutos.
        textViewdetalleNombre.text = nombre
        textViewdetalleModelo.text = modelo
        textViewdetalleTipo.text = tipo
        //De la misma forma se pueden agregar imagenes dinamicas con la libreria Glide



        //Para obtener las fotos desde el servidor se hacer así:
        // "${urlFotos}${img1}"   ---> es la ruta de donde sacas la foto
        // into(ivImagen!!    -----> es el imageView donde se va a insertar
        //Glide.with(this).load("${drawable}${modelo}").into(ivImagen!!)

        //Pero para ahorita hacerlo desde la misma app se hace asi
        //Pongo un if para que no truene el programa cuando no encuentra imagen
        //Porque nomas cargue una pura imagen.
        //Pero no se ocupa en realidad
        if(nombre == "jetta"){
            val uri = "@drawable/${nombre}"
            val imageResource = resources.getIdentifier(uri, null, packageName)
            val res = resources.getDrawable(imageResource)
            imageViewDetalle.setImageDrawable(res)
        }

    }
}