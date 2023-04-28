package com.restaurante.newcardapio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar


class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_activity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val cardapio = intent.getParcelableExtra<Cardapio>("cardapio")
        if (cardapio != null) {
            val textView: Toolbar = findViewById(R.id.toolbar)
            val detailView: TextView = findViewById(R.id.detailedActivityTv)
            val imageView: ImageView = findViewById(R.id.detailedActivityIv)

            textView.title = cardapio.titulo
            detailView.text = cardapio.descricao
            imageView.setImageResource(cardapio.imagem)
        }
    }

}

