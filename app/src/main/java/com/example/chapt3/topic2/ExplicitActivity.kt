package com.example.chapt3.topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.chapt3.R

class ExplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit)

        getdata()
    }

    fun getdata(){
        var data1 = intent.getStringExtra("angkasatu")
        var data2 = intent.getStringExtra("angkadua")
        var angka1 = findViewById(R.id.angka1) as TextView
        var angka2 = findViewById(R.id.angka2) as TextView
        angka1.text = data1
        angka2.text = data2
    }
}