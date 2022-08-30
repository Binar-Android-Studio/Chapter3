package com.example.chapt3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text


class studentcalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.studentcalculator)


        reset()
        count()

        var nextpage = findViewById(R.id.studenttriger) as Button
        nextpage.setOnClickListener {
            var pindah = Intent(this,bmicalculator::class.java)
            startActivity(pindah)
        }
    }




    fun reset (){

        var nama = findViewById(R.id.nama) as EditText
        var nim = findViewById(R.id.nim) as EditText
        var uts = findViewById(R.id.nuts) as EditText
        var uas = findViewById(R.id.nuas) as EditText
        var tugas = findViewById(R.id.ntugas) as EditText
        var hnama = findViewById(R.id.hasilnama) as TextView
        var hnim = findViewById(R.id.hasilNIM) as TextView
        var huas = findViewById(R.id.hasilUAS) as TextView
        var huts = findViewById(R.id.hasilUTS) as TextView
        var htugas = findViewById(R.id.hasiltugas) as TextView
        var htotal = findViewById(R.id.hasiltotal) as TextView
        var havg = findViewById(R.id.hasilratarata) as TextView
        var hhuruf = findViewById(R.id.hasilhuruf) as TextView
        var hstatus= findViewById(R.id.hasilstatus) as TextView
        var reset = findViewById(R.id.btnreset) as Button

        reset.setOnClickListener {
            nama.setText("")
            nim.setText("")
            uts.setText("")
            uas.setText("")
            tugas.setText("")
            hnama.setText("")
            hnim.setText("")
            huas.setText("")
            huts.setText("")
            htugas.setText("")
            htotal.setText("")
            havg.setText("")
            hhuruf.setText("")
            hstatus.setText("")
        }
    }
    fun count(){
        var nama = findViewById(R.id.nama) as EditText
        var nim = findViewById(R.id.nim) as EditText
        var uts = findViewById(R.id.nuts) as EditText
        var uas = findViewById(R.id.nuas) as EditText
        var tugas = findViewById(R.id.ntugas) as EditText
        var hnama = findViewById(R.id.hasilnama) as TextView
        var hnim = findViewById(R.id.hasilNIM) as TextView
        var huas = findViewById(R.id.hasilUAS) as TextView
        var huts = findViewById(R.id.hasilUTS) as TextView
        var htugas = findViewById(R.id.hasiltugas) as TextView
        var htotal = findViewById(R.id.hasiltotal) as TextView
        var havg = findViewById(R.id.hasilratarata) as TextView
        var hhuruf = findViewById(R.id.hasilhuruf) as TextView
        var hstatus= findViewById(R.id.hasilstatus) as TextView
        var count = findViewById(R.id.btncalculate) as Button

        count.setOnClickListener{
            hnama.text = nama.text.toString()
            hnim.text = nim.text.toString()
            huas.text = uas.text.toString()
            huts.text = uts.text.toString()
            htugas.text = tugas.text.toString()
            var total : Int = (uas.text.toString().toInt()
                        + uts.text.toString().toInt()
                        + tugas.text.toString().toInt())
            htotal.text = total.toString()
            havg.text = (total/3).toString()
            var nhrf : String
            if ((total/3)<60)
                nhrf = "F"
            else if ((total/3)<70)
                nhrf = "D"
            else if ((total/3)<80)
                nhrf = "c"
            else if ((total/3)<90)
                nhrf = "B"
            else
                nhrf = "A"
            hhuruf.text = nhrf.toString()
            var status : String

            if((total/3)<70)
                status = "Tidak Lulus"
            else
                status = "Lulus"
            hstatus.text = status.toString()
        }

    }
}