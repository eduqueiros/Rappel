package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class perfil : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

            auth = FirebaseAuth.getInstance()

            val email = intent.getStringExtra("email")
            val displayName = intent.getStringExtra("name")

            findViewById<TextView>(R.id.textView).text = displayName

            findViewById<Button>(R.id.signOutBtn).setOnClickListener {
                auth.signOut()
                startActivity(Intent(this , MainActivity::class.java))
            }
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

    fun receitas(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }

    fun saude(view: View){
        val calculadoraimc = Intent(this, calculadoraimc::class.java)
        startActivity(calculadoraimc)
    }

    fun inicio(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }

    fun pdietas(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }
}