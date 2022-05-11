package com.example.section0302

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chk = findViewById<CheckBox>(R.id.chk)
        chk.setOnCheckedChangeListener{buttonView,isChecked->

            Toast.makeText(
                this@MainActivity,
                if(isChecked)"メール送信をオン" else "メール送信をオフ",
                Toast.LENGTH_SHORT
            ).show()


        }
    }
}