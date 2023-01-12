package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class receitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas2)
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

    fun rmanter(view: View){
        val receitas_manter = Intent(this, receitas_manter::class.java)
        startActivity(receitas_manter)
    }

    fun remagrecer(view: View){
        val receitas_emagrecer = Intent(this, receitas_emagrecer::class.java)
        startActivity(receitas_emagrecer)
    }

    fun rganharpeso(view: View){
        val receitas_engordar = Intent(this, receitas_engordar::class.java)
        startActivity(receitas_engordar)
    }


}