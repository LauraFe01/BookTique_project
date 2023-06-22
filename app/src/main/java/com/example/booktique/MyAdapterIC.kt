package com.example.booktique

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterIC(private val listaLibri : ArrayList<Libro>) :
    RecyclerView.Adapter<MyAdapterIC.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val cover : ImageButton = itemView.findViewById(R.id.coverIC)
        val titolo : TextView = itemView.findViewById(R.id.titoloIC)
        val genere : TextView = itemView.findViewById(R.id.genereIC)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_libri_in_corso,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaLibri.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = listaLibri[position]
        holder.cover.setImageResource(currentItem.cover)
        holder.titolo.text = currentItem.titolo
        holder.genere.text = currentItem.genere
    }
}