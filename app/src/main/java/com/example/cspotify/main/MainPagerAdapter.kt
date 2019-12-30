package com.example.cspotify.main

import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.cspotify.R
import com.example.cspotify.favorites.FavoritesFragment
import com.example.cspotify.radios.RadiosFragment

class MainPagerAdapter(context: Context, fm: FragmentManager, behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {

    private val tabLayoutTexts: Array<String> = context.resources.getStringArray(R.array.tabs)

    override fun getItem(position: Int): Fragment {
        return when (position) {
            POSITION_RADIOS -> RadiosFragment()
            POSITION_FAVORITES -> FavoritesFragment()
            else -> throw IllegalStateException("Undefined position $position. Max count is $TAB_COUNT")
        }
    }

    override fun getCount(): Int = TAB_COUNT

    override fun getPageTitle(position: Int): CharSequence? = tabLayoutTexts[position].toUpperCase()

    companion object {

        private const val TAB_COUNT = 2

        private const val POSITION_RADIOS = 0
        private const val POSITION_FAVORITES = 1

    }

}