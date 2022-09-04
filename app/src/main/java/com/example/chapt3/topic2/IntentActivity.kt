package com.example.chapt3.topic2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import com.example.chapt3.R

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        intentdata()
        gallery()
        dataserializable()
        passingdataparcelable()
    }

    fun gallery(){
        var bttn2 = findViewById(R.id.bttn2) as Button
        bttn2.setOnClickListener {
            val pindah = Intent(Intent.ACTION_VIEW)
            pindah.data = Uri.parse("content://media/external/images/media/")
            startActivity(pindah)
        }
        var bttn3 = findViewById(R.id.bttn3) as Button
        bttn3.setOnClickListener {
            val pindah = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(pindah)
        }
        var bttn4 = findViewById(R.id.bttn4) as Button
        bttn4 .setOnClickListener {
            val pindah = Intent(Intent.ACTION_VIEW)
            pindah.data = Uri.parse("https://www.google.com/")
            startActivity(pindah)
        }
    }
    fun intentdata(){
//      Explicit Intent.kt daa satu dan dua
        var bttn = findViewById(R.id.bttn) as Button
        bttn.setOnClickListener {
            var data1 = findViewById(R.id.text1) as EditText
            var data2 = findViewById(R.id.text2) as EditText

            var inten = Intent(this, ExplicitActivity::class.java)
            inten.putExtra("angkasatu", data1.text.toString())
            inten.putExtra("angkadua", data2.text.toString())
            startActivity(inten)

        }
    }
    fun intentbundle(){
        var data1 = findViewById(R.id.text1) as EditText
        var data2 = findViewById(R.id.text2) as EditText

        var bundle = Bundle()
        var pindah =Intent(this, ExplicitActivity::class.java)
        bundle.putString("angkasatu",data1.text.toString())
        bundle.putString("angkadua",data2.text.toString())
        pindah.putExtras(bundle)
        startActivity(pindah)
    }

    fun dataserializable (){
        val inten = Intent(this, ExplicitActivity::class.java)
        var data = mahasiswaset("danial", "5025201004", "wibu")
        inten.putExtra("datamahasiswa", data)
        startActivity(inten)
    }

    fun passingdataparcelable (){
        var intent = Intent(this, Parcelable::class.java)
        var data = mahasiswapar("danial", "5025201004", "melirang")
        intent.putExtra("datamahasiswa", data)
        startActivity(intent)
    }
}