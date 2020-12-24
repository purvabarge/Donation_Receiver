package com.example.donationreceiver

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ReceiverHomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver_home_page)

        val actionBar = supportActionBar

        actionBar!!.title = "Receiver Home Page"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent = Intent(this, UploadRequirements::class.java)
            startActivity(intent)
        }
    }
}