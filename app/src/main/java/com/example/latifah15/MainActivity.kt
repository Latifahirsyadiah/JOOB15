package com.example.latifah15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tombol1 = findViewById<Button>(R.id.tombolNama)

        tombol1.setOnClickListener {
            Toast.makeText(this, "Latifah Irsyadiah", Toast.LENGTH_SHORT).show()}

        val tombol2 = findViewById<Button>(R.id.tombolKelas)

        tombol2.setOnClickListener {
            Toast.makeText(this, "XI PPLG 2", Toast.LENGTH_SHORT).show()}

        val tombol3 = findViewById<Button>(R.id.tombolNis)

        tombol3.setOnClickListener {
            Toast.makeText(this, "3005", Toast.LENGTH_SHORT).show() }
    }
}
