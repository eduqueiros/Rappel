package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class peso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.peso)
    }
    fun numerorefeicoes(view: View){
        val numeroderefeicoes = Intent(this, numeroderefeicoes::class.java)
        startActivity(numeroderefeicoes)
    }
}