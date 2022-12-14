package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class periodoobjetivo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_periodoobjetivo)
    }
    fun objetivodieta(view: View){
        val objetivodieta = Intent(this, objetivodieta::class.java)
        startActivity(objetivodieta)
    }
}