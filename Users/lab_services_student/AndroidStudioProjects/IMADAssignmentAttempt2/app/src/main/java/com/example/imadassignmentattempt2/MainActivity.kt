 package com.example.imadassignmentattempt2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var edtEnterName = findViewById<EditText>(R.id.edtEnterName)
        var edtTimeOfDay = findViewById<EditText>(R.id.edtTimeOfDay)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnLeave = findViewById<Button>(R.id.btnLeave)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnNext.setOnClickListener {
            val name = edtEnterName.text.toString()
            val time = edtTimeOfDay.text.toString()
            val intent = Intent(this, SuggestionActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("time", time)
            startActivity(intent)
        }
        //https://github.com/liehanels/MultiScreenApp/blob/master/app/src/main/java/com/example/multiscreenapp/MainActivity.kt
        //reference for this code

        btnLeave.setOnClickListener {
            finish()
        }
        //https://github.com/liehanels/MultiScreenApp/blob/master/app/src/main/java/com/example/multiscreenapp/MainActivity.kt
        //reference for this code

        btnClear.setOnClickListener {
            edtEnterName.text.clear()
            edtTimeOfDay.text.clear()
        }







    }
}