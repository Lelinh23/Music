package com.example.lab1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddMusicActivity : AppCompatActivity() {
    private lateinit var save: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_music)
    }
    private fun SaveItem(){
        save.setOnClickListener{
        }
    }
}