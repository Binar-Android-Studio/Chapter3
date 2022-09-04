package com.example.chapt3.topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.chapt3.R
import com.example.chapt3.topic2.WebView as WebView1

class WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        var website = findViewById(R.id.website) as WebView
        website.loadUrl("https://www.google.com/?hl=id")
    }
}