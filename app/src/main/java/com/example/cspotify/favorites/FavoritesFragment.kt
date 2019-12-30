package com.example.cspotify.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cspotify.R
import com.example.cspotify.radios.RadiosFragment

class FavoritesFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites,container,false)
    }

    companion object{
       fun newInstance():Fragment =  FavoritesFragment()

    }
}