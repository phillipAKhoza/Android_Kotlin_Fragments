package com.phillipdev.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    private  lateinit var nxtFragment : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nxtFragment = findViewById(R.id.btnReplace)


        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()

        val firstFragment = FirstFragment()

        fragmentTransaction.add(R.id.frame, firstFragment)

        fragmentTransaction.commit()


        nxtFragment.setOnClickListener {
            val secondFragmentManager: FragmentManager = supportFragmentManager
            val secondFragmentTraction : FragmentTransaction = secondFragmentManager.beginTransaction()

            val secondFragment = SecondFragment()

            secondFragmentTraction.replace(R.id.frame, secondFragment)
            secondFragmentTraction.commit()
        }
    }
}