package com.felabium.practicegoogleclouddeveloper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.TypedArrayUtils.getText
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.w3c.dom.Text

class SistemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sistem)

        val text : TextView = findViewById(R.id.txt)
        val caja : EditText = findViewById(R.id.edit)

        val bundle = intent.extras
        val date = bundle?.getString("username")
        Toast.makeText(this, date, Toast.LENGTH_SHORT).show()

        var boton : Button = findViewById(R.id.btn)
        boton.setOnClickListener {
            val modal = modal()
            modal.show(supportFragmentManager,"BottomSheetDialog")
        }

        var boton2 : Button = findViewById(R.id.btn2)
        boton2.setOnClickListener {
            val writeText = caja.text.toString()
            text.setText(writeText);

        }

        var botons : Button = findViewById(R.id.segundo)
        botons.setOnClickListener {
            val intent = Intent(this,QuimicaActivity::class.java)
            startActivity(intent)

        }




    }
}