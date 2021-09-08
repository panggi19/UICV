package com.panggi.uicv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnIntent = findViewById(R.id.btn_intent)
        btnIntent.setOnClickListener(this)

    }

    override fun onClick(v:View) {
        when(v.id){
            R.id.btn_intent -> run{
                val intenBiasa = Intent (this@MainActivity, ProfileActivity::class.java)
                startActivity(intenBiasa)

            }
        }
    }



}

