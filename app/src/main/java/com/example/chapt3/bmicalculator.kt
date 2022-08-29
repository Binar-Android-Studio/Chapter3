package com.example.chapt3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class bmicalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmicalculator)
        bmicalculate()

        var nextpage = findViewById(R.id.studenttriger) as Button
        nextpage.setOnClickListener {
            var pindah = Intent(this,studentcalculator::class.java)
            startActivity(pindah)
        }
    }


    fun bmicalculate(){
        var umur = findViewById(R.id.umur) as EditText
        var tinggi = findViewById(R.id.tinggibadan) as EditText
        var beratbadan = findViewById(R.id.beratbadan) as EditText
        var hasilumur = findViewById(R.id.hasilumur) as TextView
        var hasiltb = findViewById(R.id.hasiltinggibadan) as TextView
        var hasilbb = findViewById(R.id.hasilberatbadan) as TextView
        var hasilbmi = findViewById(R.id.hasilbmi) as TextView
        var kategotri = findViewById(R.id.hasilkategori) as TextView
        var calculate = findViewById(R.id.btncalculate) as Button
        var reset =  findViewById(R.id.btnreset) as Button

        calculate.setOnClickListener {
            hasilumur.text = umur.text.toString()
            hasiltb.text = tinggi.text.toString()
            hasilbb.text = beratbadan.text.toString()

            var bmi : Float = (beratbadan.text.toString().toFloat()/
                    tinggi.text.toString().toFloat()/
                    tinggi.text.toString().toFloat()*10000)

            hasilbmi.text = bmi.toString()

            var hasil : String

            if (bmi<16)
                hasil = "Terlalu Kurus"
            else if(bmi<17)
                hasil = "Cukup Kurus"
            else if(bmi<18.5)
                hasil = "Sedikit Kurus"
            else if(bmi<25)
                hasil = "Normal"
            else if(bmi<30)
                hasil = "Gemuk"
            else if(bmi<35)
                hasil = "Obesitas kelas I"
            else if(bmi<40)
                hasil = "Obesitas kelas II"
            else
                hasil = "Obesitas kelas III"

            kategotri.text = hasil

        }
    }
}