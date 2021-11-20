package com.example.superembroiderer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val VALUE = "Value"

class MainActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView


    private fun hello() {
        val helloVar = listOf("Hello!", "Hi!", "Привет!", "Доброго времени суток!")
        val helloValue = helloVar.random()
        helloTextView.text = helloValue
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.hello_text)

        if (savedInstanceState != null)
            helloTextView.text = savedInstanceState.getString(VALUE)
        else
            hello()

        val startButton : Button = findViewById(R.id.button_start)
        val intent = Intent (this, ActivityList::class.java)
        startButton.setOnClickListener {
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(VALUE, helloTextView.text.toString())

    }
}