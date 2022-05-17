package com.dicoding.hansguitar


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvGuitars: RecyclerView
    private var list: ArrayList<Guitar> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvGuitars = findViewById(R.id.rv_guitars)
        rvGuitars.setHasFixedSize(true)

        list.addAll(GuitarsData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvGuitars.layoutManager = LinearLayoutManager(this)
        val cardViewGuitarAdapter = CardViewGuitarAdapter(list)
        rvGuitars.adapter = cardViewGuitarAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                moveIntent.putExtra(AboutActivity.EXTRA_NAME, "Candra Roseahansyah")
                moveIntent.putExtra(AboutActivity.EXTRA_EMAIL, "hansrosean@gmail.com")
                startActivity(moveIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}