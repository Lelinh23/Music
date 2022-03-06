package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var main_add_item_button: FloatingActionButton

    private val recyclerView: RecyclerView
            by lazy { findViewById(R.id.recycler_view) }

    private val musicAdapter by lazy { MusicAdapter(layoutInflater,
        MusicImageLoader(this)) }

    private fun initView() {
        main_add_item_button = findViewById(R.id.main_add_item_button)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = musicAdapter
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        initView()
        openSecondScreen()
        musicAdapter.setData(
            listOf(
                MusicUiModel(
                    "Lang im",
                    "Soobin",
                    "https://cdn2.thecatapi.com/images/DBmIBhhyv.jpg"
                ),
                MusicUiModel(
                    "Im lang",
                    "Son Tung MTP",
                    "https://cdn2.thecatapi.com/images/KJF8fB_20.jpg"
                ),
                MusicUiModel(
                    "Song gio",
                    "Jack",
                    "https://cdn2.thecatapi.com/images/vJB8rwfdX.jpg"
                )
            )
        )
    }
    private fun openSecondScreen() {
        main_add_item_button.setOnClickListener {
            val intent = Intent(this@MainActivity, AddMusicActivity::class.java)
            startActivity(intent)
        }
    }
    companion object{
        val Musics = mutableListOf<MusicUiModel>()
    }
}