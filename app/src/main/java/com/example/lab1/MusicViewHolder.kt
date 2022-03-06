package com.example.lab1

import android.widget.ImageView
import android.widget.TextView

class MusicViewHolder {
    containerView: View,
    private val imageLoader: ImageLoader
) : RecyclerView.ViewHolder(containerView) {
    private val musicBiographyView: TextView
            by lazy { containerView.findViewById(R.id.item_music_singer) }
    private val musicNameView: TextView
            by lazy { containerView.findViewById(R.id.item_music_name) }
    private val musicPhotoView: ImageView
            by lazy { containerView.findViewById(R.id.item_music_photo) }
    fun bindData(musicData: MusicUiModel) {
        imageLoader.loadImage(musicData.imageUrl, musicPhotoView)
        musicNameView.text = musicData.name
        musicBiographyView.text = musicData.singer

    }
}