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
            supportActionBar!!.title = "Perfil"

            auth = FirebaseAuth.getInstance()

            val email = intent.getStringExtra("email")
            val displayName = intent.getStringExtra("name")

            findViewById<TextView>(R.id.textView).text = displayName

            findViewById<TextView>(R.id.email1).text = email

            findViewById<Button>(R.id.signOutBtn).setOnClickListener {
                auth.signOut()
                startActivity(Intent(this , MainActivity::class.java))
            }
    }


    fun receitas(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }

    fun saude(view: View){
        val psaude = Intent(this, psaude::class.java)
        startActivity(psaude)
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