package com.generation.exc_androidstudio_18_03.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.exc_androidstudio_18_03.R
import com.generation.exc_androidstudio_18_03.model.Subject

class SubjectAdapter : RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder>(){
        private var listaEstudos = emptyList<Subject>()
    class SubjectViewHolder(view: View) : RecyclerView.ViewHolder(view){



        val textSubject = view.findViewById<TextView>(R.id.textSubject)
        val textDescription = view.findViewById<TextView>(R.id.textDescription)
        val textFrequency = view.findViewById<TextView>(R.id.textFrequency)
        val textDate = view.findViewById<TextView>(R.id.textDate)
        val switchCardAtivo = view.findViewById<Switch>(R.id.status)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_estudos_layout, parent,false)

        return SubjectViewHolder(layout)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        val subject = listaEstudos[position]

        holder.textSubject.text = subject.name
        holder.textDescription.text = subject.description
        holder.textFrequency.text = subject.frequency
        holder.textDate.text = subject.date
        holder.switchCardAtivo.isChecked = subject.status
    }

    override fun getItemCount(): Int {
        return listaEstudos.size
    }

    fun changeList(lista: List<Subject>){
        listaEstudos = lista
        notifyDataSetChanged()
    }
}