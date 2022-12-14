package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class numeroderefeicoes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numeroderefeicoes)
    }
    fun periodoobjetivo(view: View){
        val periodoobjetivo = Intent(this, periodoobjetivo::class.java)
        startActivity(periodoobjetivo)
    }
}