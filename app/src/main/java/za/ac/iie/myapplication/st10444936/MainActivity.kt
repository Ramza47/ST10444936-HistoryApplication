package za.ac.iie.myapplication.st10444936

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_id)

        // get the button using the id i set on the user interface
        val compareButton = findViewById<Button>(R.id.comapreButton)

        // get the button using the id i set on the user interface
        val clearButton = findViewById<Button>(R.id.clearButton)

        // add the button to the id textview on the user interface
        val ageEditText = findViewById<EditText>(R.id.ageEditText)

        // This gives out the output result after the user have entered an input
        val resultTextView = findViewById<TextView>(R.id.resultTextView)


        // add the code to the compare button when it is clicked
        compareButton.setOnClickListener {

            // assign the text in the ageEditText to the variable userInput
            val userInput = ageEditText.text.toString()

            //Log the user input
                          Log.v("MainActivity", "User input: $userInput")

            // validate if the user entered in an age
            if (userInput.isEmpty()) {
                resultTextView.text = ""
            }

            // store age in a variable
            val userAge = userInput.toIntOrNull()

            // Validate if the age is not a valid integer
            if (userAge == null) {
                resultTextView.text = ""
            } else {
                if (userAge < 10 || userAge > 100) {
                    resultTextView.text = ""
                    ageEditText.text.clear()
                } else {



                    // to check when the user has entered an age
                    val result = when (userAge) {
                        12 -> "Hector Peterson."
                        30 -> "Steve Biko, A South African anti-apartheid activist who was the leader of Black Consciousness Movement in the late 1960s from South African Students Organization."
                        39 -> "Malcom - X, A prominent figure in the Nation of Islam and leader of the Black Power Movement that emerged in the 1960s."
                        57 -> "Stokely Carmichael, A U.S Civil Rights activist who in the 1960s came up with the slogan “Black Power” from Black Nationalism."
                        62 -> "Ngo Dinh Diem, Prime minister in South Vietnam supporting Capitalist during the Cold War."
                        78 -> "Stephanus Johannes Paulus Kruger, He was one of the dominant political and military figures in the early 19th century and a president of South Africa."
                        85 -> "Frederik Willem De Clerk, He was one of the dominant political and military figures in the early 19th century and a president of South Africa."
                        92 -> "Rosa Parks, She initiated the bus – boycotts in the Civil Rights Movement in 1955."
                        95 -> "Prince Mangosuthu Buthelezi, A politician and Zulu leader who led the Inkatha Freedom Party (IFP) from 1975 to 2019."
                        else -> "Nobody known to me died at this age"
                    }

                    // show the output to the user
                    resultTextView.text = result
                }
            }
        }

        //clear out the resultTextVew and the ageEditText on the Clear button click
        clearButton.setOnClickListener {
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}







