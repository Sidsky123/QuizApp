package com.example.quizapp

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


private lateinit var mediaPlayer: MediaPlayer

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val buttonClick = findViewById<Button>(R.id.button3)
    buttonClick.setOnClickListener {
        val intent = Intent(this, SecondPage::class.java)
        startActivity(intent)
    }

    // Initialize the media player and set the audio file
    mediaPlayer = MediaPlayer.create(this, R.raw.background_music)

    // Start playing the audio
    mediaPlayer.start()

    // Set the audio to play continuously
    mediaPlayer.isLooping = true
}

override fun onPause() {
    super.onPause()
    mediaPlayer.pause()
}

override fun onResume() {
    super.onResume()
    mediaPlayer.start()
}

override fun onDestroy() {
    super.onDestroy()
    mediaPlayer.release()
}

}