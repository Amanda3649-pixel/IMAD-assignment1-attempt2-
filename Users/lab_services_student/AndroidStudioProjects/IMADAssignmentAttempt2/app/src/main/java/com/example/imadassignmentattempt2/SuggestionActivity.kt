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
        val tvSuggestionDisplay = findViewById<TextView>(R.id.tvSuggestionDisplay)
        val btnBack = findViewById<Button>(R.id.btnNext)
        val btnLeave = findViewById<Button>(R.id.btnLeave)
        val btnGetSuggestion = findViewById<Button>(R.id.btnGetSuggestion)


        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
        }
        btnLeave.setOnClickListener {
            finish()
        }
        btnGetSuggestion.setOnClickListener {
            if (time == "Morning") {
                val tvSuggestionDisplay = listOf("Text good morning to your parents!",
                    "Video call your siblings and wish them goodluck for the day!",
                    "Send your friends a good morning meme!"
                    )
            }
            if (time == "Mid-morning") {
                val tvSuggestionDisplay = listOf("Call your friends!",
                    "Share a workout session via video call with your friends!",
                    "Text an old friend saying, 'hi'!"
                )
            }
            if (time == "Afternoon") {
                val tvSuggestionDisplay = listOf("Share a video with your friends!",
                    "Share a cat video with your colleagues!",
                    "Text your family a funny meme!"
                )
            }
            if (time == "Afternoon Snack Time") {
                val tvSuggestionDisplay = listOf("Share a trip to a cafe with friends via video call!",
                    "Go to the mall and text pixtures of it to your friends!",
                    "Send a fun link to your siblings!"
                )
            }
            if (time == "Dinner") {
                val tvSuggestionDisplay = listOf("Call your family!",
                    "Post about your dinner in a groupchat!",
                    "Share a study session with friends via video call!"
                )

            }
            if (time == "night") {
                val tvSuggestionDisplay = listOf("Say good night to your friends in a text!",
                    "Watch a movie with family over video call! ",
                    "Leave a thoughtful comment on a friends'post!"
                )
            } else {
                val tvSuggestionDisplay = "Nope! Not a real time! Try something else!"
            }



        }
        //https://www.google.com/search?q=creating+a+list+in+kotlin+code+to+display+in+textview&sca_esv=69726a373e8f47a0&rlz=1C1VDKB_enZA1158ZA1159&sxsrf=ANbL-n47RHLJp8ZExv0t8mtjAZTvCr-FWw%3A1774903673385&ei=eeHKabiZF5mni-gPxLfhkQ4&ved=0ahUKEwj4udm3v8iTAxWZ0wIHHcRbOOIQ4dUDCBE&uact=5&oq=creating+a+list+in+kotlin+code+to+display+in+textview&gs_lp=Egxnd3Mtd2l6LXNlcnAiNWNyZWF0aW5nIGEgbGlzdCBpbiBrb3RsaW4gY29kZSB0byBkaXNwbGF5IGluIHRleHR2aWV3MgUQIRigATIFECEYoAEyBRAhGKABMgUQIRigAUjZU1DzAli-UnABeACQAQCYAYUEoAHJMaoBCjItMi4xNi4wLjG4AQPIAQD4AQGYAhKgAtkswgIKEAAYsAMY1gQYR8ICBRAhGJ8FwgIHECEYoAEYCsICBhAhGBUYDcICBBAhGBWYAwCIBgGQBgiSBwoxLjAuMS4xNS4xoAf5TLIHCDItMS4xNS4xuAe6LMIHCDItMTcuMC4xyAdmgAgA&sclient=gws-wiz-serp
        //https://github.com/liehanels/MenuApp/blob/master/app/src/main/java/com/example/menuapp/MainActivity.kt
        //reference for this code



    }
}