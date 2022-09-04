package com.example.chapt3.topic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.chapt3.R

class a_Latihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alatihan)
        reset()
        senddata()
    }

    fun senddata() {
        var btn = findViewById(R.id.btncalculate) as Button
        btn.setOnClickListener {
            var umur = findViewById(R.id.umur) as EditText
            var tinggibadan = findViewById(R.id.tinggibadan) as EditText
            var beratbadan = findViewById(R.id.beratbadan) as EditText

            var inten = Intent(this, a_latihanview::class.java)
            inten.putExtra("angkasatu", umur.text.toString())
            inten.putExtra("angkadua", tinggibadan.text.toString())
            inten.putExtra("angkatiga", beratbadan.text.toString())
            startActivity(inten)
        }
    }

    fun reset(){
        var reset =  findViewById(R.id.btnreset) as Button
        var umur = findViewById(R.id.umur) as EditText
        var tinggi = findViewById(R.id.tinggibadan) as EditText
        var beratbadan = findViewById(R.id.beratbadan) as EditText

        reset.setOnClickListener {
            umur.setText("")
            tinggi.setText("")
            beratbadan.setText("")
        }

    }
}