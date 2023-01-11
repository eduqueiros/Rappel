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
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ipvc.estg.myapplication.databinding.ActivityPerfilBinding
import kotlinx.android.synthetic.main.activity_criarperfil.*

class perfil : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth
    private lateinit var database : DatabaseReference
    private lateinit var binding : ActivityPerfilBinding

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)
            supportActionBar!!.title = "Perfil"

            database = FirebaseDatabase.getInstance().getReference().child("Users")
            database.child(nome).get().addOnSuccessListener {

                if (it.exists()){

                    val nome = it.child("nome").value
                    val age = it.child("idade").value
                    Toast.makeText(this,"Successfuly Read",Toast.LENGTH_SHORT).show()
                    binding.textView.text = nome.toString()
                    binding.email1.text = age.toString()

                }else{

                    Toast.makeText(this,"User Doesn't Exist",Toast.LENGTH_SHORT).show()


                }

            }.addOnFailureListener{

                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()


            }

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

    fun inicial(view: View) {
        val pagina_inicial = Intent(this, pagina_inicial::class.java)
        startActivity(pagina_inicial)
    }

    fun pdietas(view: View){
        val dietas = Intent(this, dietas::class.java)
        startActivity(dietas)
    }
    fun volta(view: View){
        val pagina_inicial = Intent(this, pagina_inicial::class.java)
        startActivity(pagina_inicial)
    }
}