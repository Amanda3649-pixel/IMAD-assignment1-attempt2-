package com.example.imadassignmentattempt2


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
        val tvNameWelcome = findViewById<TextView>(R.id.tvNameWelcome)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnLeave = findViewById<Button>(R.id.btnLeave)
        val btnGetSuggestion = findViewById<Button>(R.id.btnGetSuggestion)

        // Display welcome message
        tvNameWelcome.text = "Welcome, $name!"


        btnBack.setOnClickListener {
            finish() // Goes back to the previous screen (MainActivity)
        }
        btnLeave.setOnClickListener {
            finishAffinity() // Closes the entire app
        }
        btnGetSuggestion.setOnClickListener {//the suggestions presented to the user
            val suggestions = when (time?.lowercase()) {
                "morning" -> listOf("Text good morning to your parents!",
                    "Video call your siblings and wish them goodluck for the day!",
                    "Send your friends a good morning meme!"
                    )

                "Mid morning" -> listOf("Call your friends!",
                    "Share a workout session via video call with your friends!",
                    "Text an old friend saying, 'hi'!"
                )

                "Afternoon" -> listOf("Share a video with your friends!",
                    "Share a cat video with your colleagues!",
                    "Text your family a funny meme!"
                )

                "Afternoon Snack time" ->listOf("Share a trip to a cafe with friends via video call!",
                    "Go to the mall and text pixtures of it to your friends!",
                    "Send a fun link to your siblings!"
                )

                "Dinner" -> listOf("Call your family!",
                    "Post about your dinner in a groupchat!",
                    "Share a study session with friends via video call!"
                )


                "Night" -> listOf("Say good night to your friends in a text!",
                    "Watch a movie with family over video call! ",
                    "Leave a thoughtful comment on a friends'post!"
                )
                else -> null

            }
            if (suggestions != null) {
                // Pick one random suggestion from the list
                tvSuggestionDisplay.text = "Hey $name! ${suggestions.random()}"
            } else {
                tvSuggestionDisplay.text = "Not a recognized time (Try: Morning, Afternoon, or night)!"
            }



        }
        //https://www.google.com/search?q=creating+a+list+in+kotlin+code+to+display+in+textview&sca_esv=69726a373e8f47a0&rlz=1C1VDKB_enZA1158ZA1159&sxsrf=ANbL-n47RHLJp8ZExv0t8mtjAZTvCr-FWw%3A1774903673385&ei=eeHKabiZF5mni-gPxLfhkQ4&ved=0ahUKEwj4udm3v8iTAxWZ0wIHHcRbOOIQ4dUDCBE&uact=5&oq=creating+a+list+in+kotlin+code+to+display+in+textview&gs_lp=Egxnd3Mtd2l6LXNlcnAiNWNyZWF0aW5nIGEgbGlzdCBpbiBrb3RsaW4gY29kZSB0byBkaXNwbGF5IGluIHRleHR2aWV3MgUQIRigATIFECEYoAEyBRAhGKABMgUQIRigAUjZU1DzAli-UnABeACQAQCYAYUEoAHJMaoBCjItMi4xNi4wLjG4AQPIAQD4AQGYAhKgAtkswgIKEAAYsAMY1gQYR8ICBRAhGJ8FwgIHECEYoAEYCsICBhAhGBUYDcICBBAhGBWYAwCIBgGQBgiSBwoxLjAuMS4xNS4xoAf5TLIHCDItMS4xNS4xuAe6LMIHCDItMTcuMC4xyAdmgAgA&sclient=gws-wiz-serp
        //https://github.com/liehanels/MenuApp/blob/master/app/src/main/java/com/example/menuapp/MainActivity.kt
        //reference for this code



    }
}