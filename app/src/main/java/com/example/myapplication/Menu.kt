package com.example.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Menu.newInstance] factory method to
 * create an instance of this fragment.
 */

class Menu : Fragment() {
    private lateinit var toCalc: ImageButton
    private lateinit var toComp: ImageButton
    private lateinit var toGaleria: ImageButton
    private lateinit var toLista: ImageButton




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            val view = inflater.inflate(R.layout.fragment_menu, container, false)


        toCalc = view.findViewById(R.id.imgbtnCalculadora)
        toCalc.setOnClickListener(){
            Funcions.toCalculadora(requireContext())
        }

        toComp = view.findViewById(R.id.imgbtnComprobar)
        toComp.setOnClickListener(){
            Funcions.toComprobar(requireContext())
        }

        toGaleria = view.findViewById(R.id.imgbtnGaleria)
        toGaleria.setOnClickListener(){
            Funcions.toGaleria(requireContext())
        }

        toLista = view.findViewById(R.id.imgbtnListado)
        toLista.setOnClickListener(){
            Funcions.toListado(requireContext())
        }

            return view
        }
}