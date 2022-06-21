package com.example.alexpetrov.ui.cicerone

import com.example.alexpetrov.data.model.HeroModel
import com.github.terrakok.cicerone.Screen

interface Listener {
    fun showMainScreen(): Screen
    fun showDetailsScreen(heroModel: HeroModel): Screen
    fun showFragmentProgram(): Screen
}