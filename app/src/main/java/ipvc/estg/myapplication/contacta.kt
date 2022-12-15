package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class contacta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contacta)
    }
    fun volta(view: View){
        val pagina_inicial = Intent(this, pagina_inicial::class.java)
        startActivity(pagina_inicial)
    }
}