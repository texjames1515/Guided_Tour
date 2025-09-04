package edu.temple.helloworldapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //do not touch this line will crash
        setContentView(R.layout.activity_main) //do not touch, will not show view




        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "Why did you click the button?"
        }

    }
}