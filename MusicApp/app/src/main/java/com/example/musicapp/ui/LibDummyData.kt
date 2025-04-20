package com.example.musicapp.ui

import androidx.annotation.DrawableRes
import com.example.musicapp.R

data class LibDummyData(
    @DrawableRes val icon: Int,
    val name: String
)

val libraries = listOf<LibDummyData>(
    LibDummyData(R.drawable.ic_playlist_green, "Playlist"),
    LibDummyData(R.drawable.ic_microphone,"Artists"),
    LibDummyData(R.drawable.ic_baseline_album_24,"Album"),
    LibDummyData(
        R.drawable.ic_baseline_music_note_24,"Songs"
    ),LibDummyData(R.drawable.ic_genre,"Genre")
)