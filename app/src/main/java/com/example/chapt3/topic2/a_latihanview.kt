package com.example.chapt3.topic2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.chapt3.R

class a_latihanview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alatihanview)
        getdata()
    }

    fun getdata(){
        var umur = intent.getStringExtra("angkasatu")
        var tinggi = intent.getStringExtra("angkadua")
        var beratbadan = intent.getStringExtra("angkatiga")

        var hasilumur = findViewById(R.id.hasilumur) as TextView
        var hasiltb = findViewById(R.id.hasiltinggibadan) as TextView
        var hasilbb = findViewById(R.id.hasilberatbadan) as TextView
        var hasilbmi = findViewById(R.id.hasilbmi) as TextView
        var kategotri = findViewById(R.id.hasilkategori) as TextView

            hasilumur.text = umur
            hasiltb.text = tinggi
            hasilbb.text = beratbadan

            var bmi : Float = (beratbadan.toString().toFloat()/
                    tinggi.toString().toFloat()/
                    tinggi.toString().toFloat()*10000)

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