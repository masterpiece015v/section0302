package com.example.section0302

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chk = findViewById<CheckBox>(R.id.chk)
        chk.setOnCheckedChangeListener{buttonView,isChecked->

            Toast.makeText(
                this@MainActivity ,
                if(isChecked)"メール送信をオン" else "メール送信をオフ",
                Toast.LENGTH_SHORT
            ).show()


        }

        val toggle = findViewById<ToggleButton>(R.id.toggle)
        toggle.setOnCheckedChangeListener{view,isChecked->
            val t = view as ToggleButton
            Toast.makeText(
                this,
                if(isChecked) t.textOn else t.textOff ,
                Toast.LENGTH_SHORT
            ).show()
        }

        val rgroup = findViewById<RadioGroup>(R.id.rgroup)
        rgroup.setOnCheckedChangeListener{group,checkedId->
            val radio = group.findViewById<RadioButton>(checkedId)
            Toast.makeText(
                this,
                String.format("「%s」が選択されました。",radio.text),
                Toast.LENGTH_SHORT
            ).show()
        }

        val seek = findViewById<SeekBar>(R.id.seek)
        seek.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                Toast.makeText(
                    this@MainActivity,
                    String.format(Locale.JAPAN,"現在地:%d",p1),
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
    }
}