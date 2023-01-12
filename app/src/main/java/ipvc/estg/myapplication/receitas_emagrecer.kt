package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class receitas_emagrecer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas_emagrecer)
    }

    fun voltar4(view: View){
        val receitas = Intent(this, receitas::class.java)
        startActivity(receitas)
    }

    fun bacalhau(view: View){
        val bacalhau_couves = Intent(this, bacalhau_couves::class.java)
        startActivity(bacalhau_couves)
    }

    fun salmao(view: View){
        val salmao_maracuja = Intent(this, salmao_maracuja::class.java)
        startActivity(salmao_maracuja)
    }

    fun espetada(view: View){
        val espetada_paris = Intent(this, espetada_paris::class.java)
        startActivity(espetada_paris)
    }


}