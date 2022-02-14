package com.sammorton11.counter_app


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnPlusButton = findViewById<Button>(R.id.plusButton)
        val btnMinusButton = findViewById<Button>(R.id.minusButton)
        val btnClickMe = findViewById<Button>(R.id.myButton)
        val btnReset = findViewById<Button>(R.id.resetButton)

        var number = 0
        var myLimit = 0



        //Button to increase limit count
        btnPlusButton.setOnClickListener {
            val limitDisplay = findViewById<TextView>(R.id.limitNumberText)
            myLimit++
            limitDisplay.text = myLimit.toString()
            val textView = findViewById<TextView>(R.id.display)
            number = 0
            textView.text = number.toString()
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 96F)
        }

        //Button to lower limit count
        btnMinusButton.setOnClickListener {
            val limitDisplay = findViewById<TextView>(R.id.limitNumberText)
            myLimit--
            limitDisplay.text = myLimit.toString()


            val textView = findViewById<TextView>(R.id.display)
            number = 0
            textView.text = number.toString()
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 96F)
        }

        //Button to count up
        btnClickMe.setOnClickListener {
            if(number != myLimit){
                val textView = findViewById<TextView>(R.id.display)
                number++
                textView.text = number.toString()

            }


            //if count reaches the set limit
            if(number == myLimit){
                val textView = findViewById<TextView>(R.id.display)
                Toast.makeText(this, "Count Completed Total:$number", Toast.LENGTH_LONG).show()
                textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 70F)
                "Complete!".also { textView.text = it }
                number += 0

            }

        }

        //Button to reset count
        btnReset.setOnClickListener {

            val textView = findViewById<TextView>(R.id.display)
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 96F)
            number = 0
            textView.text = number.toString()
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 96F)

        }




        

    }


}


