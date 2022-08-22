package com.restaurante.newcardapio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.card_layout.*

class DetailedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_activity)

        val cardapio = intent.getParcelableExtra<Cardapio>("cardapio")
        if (cardapio != null) {
            val detailView: TextView = findViewById(R.id.detailedActivityTv)
            val imageView: ImageView = findViewById(R.id.detailedActivityIv)

            //         textView.text = cardapio.titulo
            detailView.text = cardapio.descricao
            imageView.setImageResource(cardapio.imagem)
        }
    }

}

//        val cardapio = intent.getParcelableArrayExtra<Cardapio>("cardapio")
//        if(cardapio !=null){
//            val textView : TextView = findViewById(R.id.second_card_view)
//            val imageView : ImageView = findViewById(R.id.second_card_view)
//
//            textView.text = cardapio.title
//            textView.text = cardapio.details
//            imageView.setImageResource(cardapio.images)

//        }

