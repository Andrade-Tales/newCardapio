package com.restaurante.newcardapio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        val cardapios = listOf(

            Cardapio(
                "Nome da refeição",
                "Detalhes",
                R.drawable.strogonoff1,
            ),
            Cardapio(
                "Nome da refeição",
                "Detalhes",
                R.drawable.strogonoff1
            ),
            Cardapio(
                "Nome da refeição",
                "Detalhes",
                R.drawable.strogonoff1
            ),

            Cardapio(
                "Nome da refeição",
                "Detalhes",
                R.drawable.strogonoff1
            )


        )

        adapter = RecyclerAdapter(cardapios)
        recyclerView.adapter = adapter
    }
}