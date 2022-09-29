package com.example.constraitlayout

import android.content.res.Configuration
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show()
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val pic : ImageView = findViewById(R.id.imageView)
        pic.setImageResource(R.drawable.jolyne)
        val pic1 : ImageView = findViewById(R.id.imageView3)
        pic1.setImageResource(R.drawable.jolyne)
        val pic2 : ImageView = findViewById(R.id.imageView2)
        pic2.setImageResource(R.drawable.jolyne)
    }


}