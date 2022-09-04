package com.example.chapt3.topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.chapt3.R

class Serializable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)
    }

    fun getdataserializable(){
        var data = intent.getSerializableExtra("datamahasiswa") as mahasiswaset
        var nametxt =  findViewById(R.id.nama) as TextView
        nametxt.text = data.nama
    }
}