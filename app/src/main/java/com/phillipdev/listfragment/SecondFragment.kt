package com.phillipdev.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SecondFragment : Fragment() {

    lateinit var imageView: ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_second, container, false)
        imageView = view.findViewById(R.id.imageView)

        val position =arguments?.getInt("position", 0)

        when(position){
            0 -> imageView.setImageResource(R.drawable.pretoria)
            1 -> imageView.setImageResource(R.drawable.cape_town)
            2 -> imageView.setImageResource(R.drawable.johannesburg)
            3 -> imageView.setImageResource(R.drawable.durban)
            4 -> imageView.setImageResource(R.drawable.p_e)
        }
        // Inflate the layout for this fragment
        return view
    }

}