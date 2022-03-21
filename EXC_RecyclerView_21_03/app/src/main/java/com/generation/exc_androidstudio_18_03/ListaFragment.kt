package com.generation.exc_androidstudio_18_03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.exc_androidstudio_18_03.adapter.SubjectAdapter
import com.generation.exc_androidstudio_18_03.model.Subject


class ListaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_lista, container, false)

        val listEstudos = mutableListOf(
            Subject(
                "Mandarim",
                "Grammar and Vocabulary",
                "3x at week",
                "21/03/2022",
                true
            ),
            Subject(
                "Kotlin",
                "POO",
                "Everyday",
                "25/03/2022",
                false
            ),
            Subject(
                "Swift",
                "Looping",
                "1x at week",
                "29/03/2022",
                false
            )

        )
        // Inflate the layout for this fragment
        val recyclerSubject = view.findViewById<RecyclerView>(R.id.RecyclerTarefa)

        val adapterSubject = SubjectAdapter()

        recyclerSubject.layoutManager = LinearLayoutManager(context)

        recyclerSubject.adapter= adapterSubject

        recyclerSubject.setHasFixedSize(true)

        adapterSubject.changeList(listEstudos)

        return view
    }

}