package com.example.lab1

import android.view.LayoutInflater
import android.view.ViewGroup

class MusicAdapter {
    private val layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader
) : RecyclerView.Adapter<MusicViewHolder>() {
    private val musicData = mutableListOf<MusicUiModel>()
    fun setData(musicData: List<MusicUiModel>) {
        this.musicData.clear()
        this.musicData.addAll(musicData)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MusicViewHolder {
        val view = layoutInflater.inflate(R.layout.item_music,
            parent, false)
        return MusicViewHolder(view, imageLoader)
    }
    override fun getItemCount() = musicData.size
    override fun onBindViewHolder(holder: MusicViewHolder,
                                  position: Int) {
        holder.bindData(musicData[position])
    }
}