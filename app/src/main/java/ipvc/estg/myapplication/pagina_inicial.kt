package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pagina_inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagina_inicial)
    }
    fun contacta(view: View){
        val contacta = Intent(this, contacta::class.java)
        startActivity(contacta)
    }

    fun saude(view: View){
        val psaude = Intent(this, psaude::class.java)
        startActivity(psaude)
    }
    fun pdietas(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }
    fun perfil2(view: View){
        val perfil = Intent(this, perfil::class.java)
        startActivity(perfil)
    }

    fun receitas2(view: View){
        val receitas = Intent(this, receitas::class.java)
        startActivity(receitas)
    }
}