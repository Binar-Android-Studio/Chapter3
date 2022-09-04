package com.example.chapt3.topic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapt3.R

class Parcelable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pa_arcelable)

        var dataperson = intent.getParcelableArrayExtra("datamahasiswa") as mahasiswapar

    }
}