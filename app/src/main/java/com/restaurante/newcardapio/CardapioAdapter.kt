package com.restaurante.newcardapio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.view.*
import java.text.FieldPosition

class CardapioAdapter(private val cardapioList: ArrayList<Cardapio>) :
    RecyclerView.Adapter<CardapioAdapter.CardapioViewHolder>() {

    var onItemClick: ((Cardapio) -> Unit)? = null

    class CardapioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textView)
        val detailView: TextView = itemView.findViewById(R.id.detailView)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardapioViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return CardapioViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardapioViewHolder, position: Int) {
        val cardapio = cardapioList[position]
        holder.textView.text = cardapio.titulo
        holder.detailView.text = cardapio.descricao
        holder.imageView.setImageResource(cardapio.imagem)

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(cardapio)
        }

    }

    override fun getItemCount(): Int {
        return cardapioList.size
    }
}