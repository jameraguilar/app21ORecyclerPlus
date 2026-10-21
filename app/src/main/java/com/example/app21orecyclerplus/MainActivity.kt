package com.example.app21orecyclerplus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Los datos
        val frutas = listOf(
            Fruta("Manzana", 1.20, "fruta"),
            Fruta("Plátano", 0.95, "foto"),
            Fruta("Naranja", 1.10, "fruta"),
            Fruta("Fresa", 3.50, "foto"),
            Fruta("Kiwi", 2.80, "fruta"),
            Fruta("Uva", 2.40, "foto"),
            Fruta("Pera", 1.60, "fruta"),
            Fruta("Melón", 1.30, "foto"),
            Fruta("Sandía", 0.90, "fruta"),
            Fruta("Mango", 3.20, "foto")
        )

        // 2. Buscar el RecyclerView del XML
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // 3. Cómo se colocan las filas: una debajo de otra
        recyclerView.layoutManager = LinearLayoutManager(this)

        // 4. Asignar el Adapter con los datos
        recyclerView.adapter = FrutaAdapter(frutas)
    }
}
