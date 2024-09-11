package br.com.fiap.entreactivities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityB : Activity() {

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.blayout)

        val botaoVoltarParaActivityA = findViewById<Button>(R.id.botaoParaActA)

        val b1 = intent.extras
        val texto = b1?.getString("TEXTO_A")?:""

        findViewById<TextView>(R.id.inputMsgA).setText(texto)

        botaoVoltarParaActivityA.setOnClickListener {
            val intent2 = Intent(this, ActivityA::class.java)
            startActivity( intent2 )
        }
    }
}