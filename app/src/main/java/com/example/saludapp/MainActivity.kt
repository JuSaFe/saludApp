package com.example.saludapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello: AppCompatButton = findViewById(R.id.btnHello)
        val etName:AppCompatEditText = findViewById(R.id.etName)
        btnHello.setOnClickListener {
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
                Snackbar.make(btnHello, "Hola $name!", Snackbar.LENGTH_SHORT)
                    .setAnchorView(btnHello)
                    .setAction("RESET") { etName.setText(null)}
                    .show()
            } else {
                Toast.makeText(this, "Introduce un nombre", Toast.LENGTH_LONG).show()
            }
        }
    }
}