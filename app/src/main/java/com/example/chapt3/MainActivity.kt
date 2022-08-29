package com.example.chapt3

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator)

        var submit = findViewById(R.id.calculate) as Button
        var reset = findViewById(R.id.reset) as Button

        submit.setOnClickListener {
            var nilai1 = findViewById(R.id.nilai1) as EditText
            var nilai2 = findViewById(R.id.nilai2) as EditText
            var hasil = nilai2.text.toString().toInt() + nilai1.text.toString().toInt()
            var text = findViewById(R.id.hasil) as TextView
            text.text = hasil.toString()
        }
        reset.setOnClickListener {
            var nilai1 = findViewById(R.id.nilai1) as EditText
            var nilai2 = findViewById(R.id.nilai2) as EditText
            nilai1.setText("")
            nilai2.setText("")
        }
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//        var btnklik = findViewById(R.id.buttonPanel) as Button
//        var text = findViewById(R.id.txthasil) as TextView
//        var btnklik2 = findViewById(R.id.buttonPanel2) as Button
//
//        btnklik.setOnClickListener{
//            text.text = "sudah di klik"
//        }
//
//        btnklik2.setOnClickListener{
//            text.text = "ter klick 2"
//        }
//
////        Button Add nama
//        var inputname = findViewById(R.id.inputnama) as EditText
//        var submit = findViewById(R.id.simpannama) as Button
//        var textname = findViewById(R.id.textnama) as TextView
//        submit.setOnClickListener{
//            var nama = inputname.text.toString()
//            textname.text = nama
//        }
//        var btnhome = findViewById(R.id.home) as Button
//        btnhome.setOnClickListener {
//            var pindah = Intent(this,HOME::class.java)
//            startActivity(pindah)
//        }
//    }
}