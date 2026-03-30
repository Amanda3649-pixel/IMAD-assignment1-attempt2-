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
        //declaring variables

        var edtEnterName = findViewById<EditText>(R.id.edtEnterName)
        var edtTimeOfDay = findViewById<EditText>(R.id.edtTimeOfDay)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnLeave = findViewById<Button>(R.id.btnLeave)
        val btnClear = findViewById<Button>(R.id.btnClear)

        btnNext.setOnClickListener {
            //send answer to next page
            val name = edtEnterName.text.toString().trim()
            val time = edtTimeOfDay.text.toString().trim()
            val intent = Intent(this, SuggestionActivity::class.java)


            if (name.any { it.isDigit() }) {
                //error handling
                edtEnterName.error = "Please enter your name"
            }
            if (name.any { it.isDigit() }) {
                edtTimeOfDay.error = "Please enter the time of day"
                if (time.isEmpty()) {
                    edtEnterName.error = "Please enter your name in words"
                    return@setOnClickListener
                }

                if (time.isEmpty()) {
                    edtTimeOfDay.error = "Please enter the time of day in words"
                    return@setOnClickListener
                }
                else{
                    val intent = Intent(this, SuggestionActivity::class.java)
                    intent.putExtra("name", name)
                    intent.putExtra("time", time)
                    startActivity(intent)
                }

                }
        }
        //https://github.com/liehanels/MultiScreenApp/blob/master/app/src/main/java/com/example/multiscreenapp/MainActivity.kt
        //reference for this code

        btnLeave.setOnClickListener {
        //to end the app running
            finish()
        }
        //https://github.com/liehanels/MultiScreenApp/blob/master/app/src/main/java/com/example/multiscreenapp/MainActivity.kt
        //reference for this code

        btnClear.setOnClickListener {
            edtEnterName.text.clear()
            edtTimeOfDay.text.clear()
        }//to clear what the user entered







    }
}