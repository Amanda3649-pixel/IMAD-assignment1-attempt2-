package com.example.imadassignmentattempt2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuggestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suggestion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val name = intent.getStringExtra("name")
        val time = intent.getStringExtra("time")
        var tvSuggestionDisplay = findViewById<TextView>(R.id.tvSuggestionDisplay)
        val btnBefore = findViewById<Button>(R.id.btnNext)
        val btnLeave = findViewById<Button>(R.id.btnLeave)
        val btnGetSuggestion = findViewById<Button>(R.id.btnGetSuggestion)


        btnBefore.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }
        btnLeave.setOnClickListener {
            finish()
        }
        btnGetSuggestion.setOnClickListener {
            


        }


    }
}