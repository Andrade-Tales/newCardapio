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

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        cardapioList = ArrayList()

        cardapioList.add(Cardapio("Salada", "Descrição do cardapio", R.drawable.salada1))
        cardapioList.add(Cardapio("Panqueca", "Descrição do cardapio", R.drawable.dosa1))
        cardapioList.add(Cardapio("Macarrão", "Descrição do cardapio", R.drawable.pasta1))
        cardapioList.add(Cardapio("Arroz veg", "Descrição do cardapio", R.drawable.veg_biryani))

        cardapioAdapter = CardapioAdapter(cardapioList)
        recyclerView.adapter = cardapioAdapter

        cardapioAdapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("cardapio", it)

            startActivity(intent)
        }
    }
}


//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.os.Parcelable
//import android.view.View
//import androidx.appcompat.app.AppCompatDelegate
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.activity_main.*
//
//class MainActivity : AppCompatActivity() {
//
//    private var layoutManager: RecyclerView.LayoutManager? = null
//    private var adapter: RecyclerView.Adapter<CardapioAdapter.ViewHolder>? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//
//        layoutManager = LinearLayoutManager(this)
//
//        recyclerView.layoutManager = layoutManager
//
//        val cardapios = listOf(
//
//            Cardapio(
//                "Nome da refeição",
//                "Detalhes",
//                R.drawable.strogonoff1,
//            ),
//            Cardapio(
//                "Nome da refeição",
//                "Detalhes",
//                R.drawable.strogonoff1
//            ),
//            Cardapio(
//                "Nome da refeição",
//                "Detalhes",
//                R.drawable.strogonoff1
//            ),
//
//            Cardapio(
//                "Nome da refeição",
//                "Detalhes",
//                R.drawable.strogonoff1
//            )
//
//        )
//
//        adapter = CardapioAdapter(cardapios)
//        recyclerView.adapter = adapter
//
//        recyclerView.setOnClickListener {
//            Cardapio
//
//            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("cardapio", it)
//
//        }
//
//    }
//
//
//}
//
//private fun Parcelable.putExtra(s: String, it: View?) {
//
//}
