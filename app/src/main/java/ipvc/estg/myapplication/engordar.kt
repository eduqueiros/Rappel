package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class engordar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.receitas_engordar)
    }

    fun frangopanado(view: View){
        val frangopanado= Intent(this, frangopanado::class.java)
        startActivity(frangopanado)
    }

    fun peixepanado(view: View){
        val peixepanado= Intent(this, peixepanado::class.java)
        startActivity(peixepanado)
    }

    fun carneassada(view: View){
        val carneassada= Intent(this, carneassada::class.java)
        startActivity(carneassada)
    }

    fun mac1(view: View){
        val mac1= Intent(this, mac1::class.java)
        startActivity(mac1)
    }

    fun mac2(view: View){
        val mac2= Intent(this, mac2::class.java)
        startActivity(mac2)
    }
    fun volta(view: View){
        val receitas= Intent(this,receitas::class.java)
        startActivity(receitas)
    }

}

