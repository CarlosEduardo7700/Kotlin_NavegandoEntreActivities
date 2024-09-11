package br.com.fiap.entreactivities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityA : Activity() {

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.alayout)

        val botaoParaAcitivityB = findViewById<Button>(R.id.botaoParaActB)
        val textoActivityA = findViewById<TextView>(R.id.inputA)
        botaoParaAcitivityB.setOnClickListener {
            val intent1 = Intent(this, ActivityB::class.java)
            val b1 = Bundle()
            b1.putString("TEXTO_A", textoActivityA.text.toString())
            intent1.putExtras(b1)
            startActivity( intent1 )
        }
    }
}