📱 Overview of IMAD Assignment Attempt 2:

This is an Android app created with Android Studio and Kotlin.
When a user enters their name and the time of day, the app generates a random suggestion of socialization based off that.

Features:

🎯💻 Input from the user:
Name and time of day

🔄 Switching between two screens:
input on the main screen
Suggestion screen (output) 

⚠️ Error management
keeps input from being empty
stops entering numbers when text is needed.

🎲 Time-based random suggestion generator 

🧹 Clear button to reset inputs

📱 Exit button to end the application


1. The main activity
   
gathers input from users:
Name
The time of day
Verifies input:
Verifies that inputs aren't empty
Verifies that text is entered rather than numbers.
Uses Intent to send data to the following screen.


2. Recommendation Activity


Name and time of day
shows a greeting message
makes recommendations based on time:
Morning, midmorning, and afternoon
Snack time in the afternoon
Dinner at night
shows a random recommendation

. navigation:
The back button
Button to exit

3. Utilized Technology
Kotlin
Android SDK and Android Studio
Intents (for navigating the screen)
View elements (TextView, Button, and EditText)


4. The Operation
The user inputs their name and the time of day.
The app verifies the input
The user selects the Next button.
The second screen receives the data.
The user selects the "Get Suggestion," button.
Based on the time, the app gives a random recommendation

⚠️ Rules for Input
Only letters may be used in the name.
Time must be entered as words (such as "morning" or "afternoon").
Fields that are empty are not allowed.



Citations
An example of a multi-screen app
The MultiScreenApp can be found at https://github.com/liehanels
Example of a menu app:
https://liehanels.github.com/MenuApp
Research on Kotlin list usage (guided by a Google search) 


