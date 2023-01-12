package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class receitas_manter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas_manter)
    }

    fun espinafre(view: View){
        val omelete_espinafre = Intent(this, omelete_espinafre::class.java)
        startActivity(omelete_espinafre)
    }

    fun salada(view: View){
        val salada_macarrao = Intent(this, salada_macarrao::class.java)
        startActivity(salada_macarrao)
    }
}