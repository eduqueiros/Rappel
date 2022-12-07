package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class perfil : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        return when (item.itemId){
            R.id.editar ->{
                Toast.makeText( this,"cidadesPortugal", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.contactos ->{
                Toast.makeText( this,"rappel@ipvc.pt", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.lembretes ->{
                Toast.makeText( this,"getCountryFromAveiro", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.metas->{
                Toast.makeText( this,"alterar", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun pdietas(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }

    fun saude(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }

    fun inicio(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }

    fun plano(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }
}