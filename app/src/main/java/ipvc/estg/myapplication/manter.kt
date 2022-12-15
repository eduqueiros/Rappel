package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class manter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.receitasmanter)
    }

    fun omeleteespinafre(view: View){
        val omeleteespinafre= Intent(this, omeleteespinafre::class.java)
        startActivity(omeleteespinafre)
    }

    fun saladamac(view: View){
        val saladamac= Intent(this, saladamac::class.java)
        startActivity(saladamac)
    }

    fun espetinho(view: View){
        val espetinho= Intent(this, espetinho::class.java)
        startActivity(espetinho)
    }

    fun saladamelancia(view: View){
        val saladamelancia= Intent(this, saladamelancia::class.java)
        startActivity(saladamelancia)
    }

    fun frangogrelhado(view: View){
        val frangogrelhado= Intent(this, frangogrelhado::class.java)
        startActivity(frangogrelhado)
    }
    fun volta(view: View){
        val receitas= Intent(this,receitas::class.java)
        startActivity(receitas)
    }

}

