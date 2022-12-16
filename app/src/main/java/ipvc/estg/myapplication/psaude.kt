package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class psaude : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psaude)
    }

    fun imc(view: View) {
        val saude = Intent(this, saude::class.java)
        startActivity(saude)
    }
    fun perfil2(view: View) {
        val perfil = Intent(this, perfil::class.java)
        startActivity(perfil)
    }
    fun pdietas(view: View) {
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }
    fun passos(view: View) {
        val contadorpassos = Intent(this, contadorpassos::class.java)
        startActivity(contadorpassos)
    }
    fun inicial(view: View) {
        val pagina_inicial = Intent(this, pagina_inicial::class.java)
        startActivity(pagina_inicial)
    }
}