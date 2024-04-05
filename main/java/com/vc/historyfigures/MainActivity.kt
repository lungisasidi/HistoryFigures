package com.vc.historyfigures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declartions
     val generateButton = findViewById<Button>(R.id.generateButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val numTextNumber = findViewById<EditText>(R.id.ageTextNumber)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        generateButton.setOnClickListener {

        /* if else statement */
            val age = numTextNumber.text.toString().toIntOrNull()
            if (age == null) {
                resultTextView.text = "Please enter a valid age"

            }else{
                if (age<20 || age>100) {
                resultTextView.text = "please enter a valid age between 20 and 100 "
                    numTextNumber.text.clear()
                } else {
                    /* 10 Dead people I chose */
                    val result = when (age) {
                        39 -> "Martin Luther King Jr. was an American Christian minister, activist," +
                                " and political philosopher who was one of the most prominent leaders" +
                                "in the civil rights movement from 1955 until his assassination in 1968."

                        27 -> "Kurt Donald Cobain was an American musician who was the lead vocalist," +
                                "guitarist, songwriter, and a member of the grunge rock band Nirvana."

                        82 -> "Edson Arantes do Nascimento, better known by his nickname Pelé, was a" +
                                "Brazilian professional footballer who played as a forward." +
                                " Widely regarded as one of the greatest players of all time,"

                        46 -> "John Fitzgerald Kennedy, often referred to as JFK, was an American" +
                                " politician who served as the 35th president of the United States from 1961 until his assassination in 1963."

                        56 -> "Adolf Hitler was an Austrian-born German politician who was the dictator" +
                                " of Nazi Germany from 1933 until his suicide in 1945. He rose to power as the leader of the Nazi Party."

                        50 -> "Michael Joseph Jackson was an American singer, songwriter, dancer, and philanthropist." +
                                " Known as the \"King of Pop\", he is regarded as one of the most significant cultural figures of the 20th century."

                        25 -> "Tupac Amaru Shakur, also known by his stage names 2Pac and Makaveli, was an American rapper." +
                                " Considered one of the most influential and successful rappers of all time."

                        95 -> "Nelson Rolihlahla Mandela was a South African anti-apartheid activist, " +
                                "politician, and statesman who served as the first president of South Africa from 1994 to 1999"

                        76 -> "Albert Einstein was a German-born theoretical physicist who is widely" +
                                " held to be one of the greatest and most influential scientists of all time."

                        67 -> "Leonardo di ser Piero da Vinci was an Italian polymath of the High" +
                                " Renaissance who was active as a painter, draughtsman, engineer, scientist, theorist, sculptor, and architect."

                        else -> "No one Died at this, try a different one!"
                    }
                    resultTextView.text = result
                    clearButton.setOnClickListener {
                        numTextNumber.text.clear()
                        resultTextView.text = ""
                    }
                }}}}}
