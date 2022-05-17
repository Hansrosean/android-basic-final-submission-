package com.dicoding.hansguitar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val picture = intent.getIntExtra(EXTRA_PICTURES, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val material = intent.getStringExtra(EXTRA_MATERIAL)
        val neck = intent.getStringExtra(EXTRA_NECK)
        val color = intent.getStringExtra(EXTRA_COLOR)
        val price = intent.getStringExtra(EXTRA_PRICE)

        supportActionBar?.title = name
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imgPicture: ImageView = findViewById(R.id.img_item_pictures)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val tvMaterial: TextView = findViewById(R.id.tv_material)
        val tvNeck: TextView = findViewById(R.id.tv_neck)
        val tvColor: TextView = findViewById(R.id.tv_color)
        val tvPrice: TextView = findViewById(R.id.tv_price)
        
        tvName.text = name
        tvDetail.text = detail
        tvMaterial.text = material
        tvNeck.text = neck
        tvColor.text = color
        tvPrice.text = price

        Glide.with(this)
            .load(picture)
            .apply(RequestOptions().override(244, 748))
            .into(imgPicture)

        val btnBuy: Button = findViewById(R.id.toast_button)
        btnBuy.setOnClickListener {
            Toast.makeText(
                this,
                "Successfully purchased",
                Toast.LENGTH_SHORT
            ).show()
        }

    }

    companion object {
        const val EXTRA_PICTURES = "extra_pictures"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_MATERIAL = "extra_material"
        const val EXTRA_NECK = "extra_neck"
        const val EXTRA_COLOR = "extra_color"
        const val EXTRA_PRICE = "extra_price"
    }

}