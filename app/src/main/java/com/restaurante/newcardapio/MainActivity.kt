package com.restaurante.newcardapio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cardapioList: ArrayList<Cardapio>
    private lateinit var cardapioAdapter: CardapioAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        cardapioList = ArrayList()

        cardapioList.add(Cardapio("Salada", "Detalhes", R.drawable.salada1))
        cardapioList.add(Cardapio("Panqueca", "Detalhes", R.drawable.dosa1))
        cardapioList.add(Cardapio("Macarrão", "Detalhes", R.drawable.pasta1))
        cardapioList.add(Cardapio("Arroz veg", "Detalhes", R.drawable.veg_biryani))

        cardapioList.add(Cardapio("Salada", "Detalhes", R.drawable.salada1))
        cardapioList.add(Cardapio("Panqueca", "Detalhes", R.drawable.dosa1))
        cardapioList.add(Cardapio("Macarrão", "Detalhes", R.drawable.pasta1))
        cardapioList.add(Cardapio("Arroz veg", "Detalhes", R.drawable.veg_biryani))

        cardapioAdapter = CardapioAdapter(cardapioList)
        recyclerView.adapter = cardapioAdapter

        cardapioAdapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("cardapio", it)

            startActivity(intent)
        }
    }

}

