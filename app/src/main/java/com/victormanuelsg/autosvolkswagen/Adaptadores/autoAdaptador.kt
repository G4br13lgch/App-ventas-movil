package com.victormanuelsg.autosvolkswagen.Adaptadores


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.victormanuelsg.autosvolkswagen.Modelos.modeloAuto
import com.victormanuelsg.autosvolkswagen.R
import com.victormanuelsg.autosvolkswagen.detallesAuto
import kotlinx.android.synthetic.main.item_auto.view.*
import kotlinx.android.synthetic.main.activity_lista_autos.view.*

class autoAdaptador(private val listaAutos:List<modeloAuto>, context: Context): RecyclerView.Adapter<autoAdaptador.AutoViewHolder>() {
    var autos: List<modeloAuto> = listaAutos
    val context = context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AutoViewHolder {
        return AutoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_auto,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AutoViewHolder, position: Int) {
        holder.itemView.textViewNombre.text = autos[position].nombre
        holder.itemView.textViewModelo.text = autos[position].modelo
        holder.itemView.editTextTipo.text = autos[position].tipo

        holder.itemView.setOnClickListener {
            Toast.makeText(context,"Se seleccionó el auto${autos[position].nombre}",Toast.LENGTH_SHORT).show()
            //Aqui es donde haces un intent a la otra vista y mandas los parametros que opuces
            //usando el put
            //ejemplo
            val intent = Intent(context, detallesAuto::class.java).apply{
                putExtra("nombre",autos[position].nombre)
                putExtra("modelo",autos[position].modelo)
                putExtra("tipo",autos[position].modelo)

            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return autos.size
    }

    class AutoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}