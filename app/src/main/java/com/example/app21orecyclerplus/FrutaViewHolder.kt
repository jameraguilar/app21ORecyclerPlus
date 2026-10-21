package com.example.app21orecyclerplus

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// ViewHolder: guarda las vistas de UNA fila
class FrutaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val tvNombre: TextView = view.findViewById(R.id.tvNombre)
    val tvPrecio: TextView = view.findViewById(R.id.tvPrecio)
    val ivFoto: ImageView = view.findViewById(R.id.ivFoto)
}
