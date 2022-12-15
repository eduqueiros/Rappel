package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class emagrecer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.receitasemagrecer)
    }

    fun frangosalteado(view: View){
        val frangosalteado= Intent(this, frangosalteado::class.java)
        startActivity(frangosalteado)
    }

    fun espetada(view: View){
        val espetada= Intent(this, espetada::class.java)
        startActivity(espetada)
    }

    fun salmao(view: View){
        val salmao= Intent(this, salmao::class.java)
        startActivity(salmao)
    }

    fun bacalhau(view: View){
        val bacalhau= Intent(this, bacalhau::class.java)
        startActivity(bacalhau)
    }

    fun saladaatum(view: View){
        val saladaatum= Intent(this, saladaatum::class.java)
        startActivity(saladaatum)
    }
    fun volta(view: View){
        val receitas= Intent(this,receitas::class.java)
        startActivity(receitas)
    }

}

