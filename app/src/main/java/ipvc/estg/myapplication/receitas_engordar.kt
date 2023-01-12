package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class receitas_engordar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas_engordar)
    }

    fun voltar4(view: View){
        val receitas = Intent(this, receitas::class.java)
        startActivity(receitas)
    }

    fun carne(view: View){
        val carne_queijo = Intent(this, carne_queijo::class.java)
        startActivity(carne_queijo)
    }

    fun peixe(view: View){
        val peixe_panado = Intent(this, peixe_panado::class.java)
        startActivity(peixe_panado)
    }

    fun mac(view: View){
        val macarrao_bacon = Intent(this, macarrao_bacon::class.java)
        startActivity(macarrao_bacon)
    }

}