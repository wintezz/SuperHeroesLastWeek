package com.example.alexpetrov.ui.cicerone

import com.example.alexpetrov.data.model.HeroModel
import com.example.alexpetrov.ui.fragment.DetailsFragment
import com.example.alexpetrov.ui.fragment.FragmentProgram
import com.example.alexpetrov.ui.fragment.MainFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

class MainScreen : Listener {

    override fun showMainScreen() = FragmentScreen {
        MainFragment()
    }

    override fun showDetailsScreen(heroModel: HeroModel) = FragmentScreen {
        DetailsFragment.newInstance(heroModel)
    }

    override fun showFragmentProgram() = FragmentScreen {
        FragmentProgram()
    }
}