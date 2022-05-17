package com.dicoding.hansguitar

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewGuitarAdapter(private val listGuitar: ArrayList<Guitar>) :
    RecyclerView.Adapter<CardViewGuitarAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_guitar, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val guitar = listGuitar[position]

        Glide.with(holder.itemView.context)
            .load(guitar.picture)
            .apply(RequestOptions().override(244, 748))
            .into(holder.imgPicture)

        holder.tvName.text = guitar.name
        holder.tvDetail.text = guitar.detail

        holder.btnBuy.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Successfully purchased " + listGuitar[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }   

        holder.cvItem.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PICTURES, guitar.picture)
            intent.putExtra(DetailActivity.EXTRA_DETAIL, guitar.detail)
            intent.putExtra(DetailActivity.EXTRA_NAME, guitar.name)
            intent.putExtra(DetailActivity.EXTRA_MATERIAL, guitar.material)
            intent.putExtra(DetailActivity.EXTRA_NECK, guitar.neck)
            intent.putExtra(DetailActivity.EXTRA_COLOR, guitar.color)
            intent.putExtra(DetailActivity.EXTRA_PRICE, guitar.price)

            holder.itemView.context.startActivity(intent)
        }

        holder.btnDetail.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PICTURES, guitar.picture)
            intent.putExtra(DetailActivity.EXTRA_DETAIL, guitar.detail)
            intent.putExtra(DetailActivity.EXTRA_NAME, guitar.name)
            intent.putExtra(DetailActivity.EXTRA_MATERIAL, guitar.material)
            intent.putExtra(DetailActivity.EXTRA_NECK, guitar.neck)
            intent.putExtra(DetailActivity.EXTRA_COLOR, guitar.color)
            intent.putExtra(DetailActivity.EXTRA_PRICE, guitar.price)

            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listGuitar.size
    }

    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPicture: ImageView = itemView.findViewById(R.id.img_item_pictures)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnBuy: Button = itemView.findViewById(R.id.btn_buy)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
        var cvItem: CardView = itemView.findViewById(R.id.card_view)
    }

}


