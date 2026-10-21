package com.example.app21orecyclerplus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FrutaAdapter(private val frutas: List<Fruta>) :
    RecyclerView.Adapter<FrutaViewHolder>() {

    // A) Crea una fila nueva a partir de item_fruta.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrutaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fruta, parent, false)
        return FrutaViewHolder(view)
    }

    // B) Rellena la fila con la fruta de esa posición
    override fun onBindViewHolder(holder: FrutaViewHolder, position: Int) {
        val fruta = frutas[position]

        holder.tvNombre.text = fruta.nombre
        holder.tvPrecio.text = String.format("%.2f €", fruta.precio)

        // Buscar la imagen en res/drawable a partir de su nombre
        val context = holder.itemView.context
        val idFoto = context.resources.getIdentifier(fruta.foto, "drawable", context.packageName)
        holder.ivFoto.setImageResource(idFoto)
    }

    // C) Dice cuántos elementos hay
    override fun getItemCount(): Int = frutas.size
}
