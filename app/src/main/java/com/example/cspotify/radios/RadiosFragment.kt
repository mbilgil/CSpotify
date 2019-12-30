package com.example.cspotify.radios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cspotify.R
import com.example.cspotify.favorites.FavoritesFragment

class RadiosFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_radios,container,false)

    }
    companion object{
        fun newInstance():Fragment =  RadiosFragment()

    }
}