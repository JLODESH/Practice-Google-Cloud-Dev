package com.felabium.practicegoogleclouddeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class QuimicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quimica)

        val t1 : TextView = findViewById(R.id.txt1)
        val t2 : TextView = findViewById(R.id.txt2)
        val caja2 : EditText = findViewById(R.id.label)

        var botonq : Button = findViewById(R.id.btn4)
        botonq.setOnClickListener {

            val writeText = caja2.text.toString()
            t1.setText(writeText);

            val modalqu = modalq()
            modalqu.show(supportFragmentManager,"BottomSheetDialog")
        }


    }
}