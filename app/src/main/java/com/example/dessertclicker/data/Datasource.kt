package com.example.dessertclicker.data

import com.example.dessertclicker.R

object Datasource {
    val dessertList = listOf(
        Dessert(R.drawable.cupcake, price = 5, startProductionAmount = 0),
        Dessert(R.drawable.donut, price = 10, startProductionAmount = 5),
        Dessert(R.drawable.eclair, price = 15, startProductionAmount = 20),
        Dessert(R.drawable.froyo, price = 30, startProductionAmount = 50),
        Dessert(R.drawable.gingerbread, price = 50, startProductionAmount = 100),
        Dessert(R.drawable.honeycomb, price = 100, startProductionAmount = 200),
        Dessert(R.drawable.icecream, price = 500, startProductionAmount = 500),
        Dessert(R.drawable.jellybean, price = 1000, startProductionAmount = 1000)
    )
}
