package ipvc.estg.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ipvc.estg.myapplication.DB.User
import ipvc.estg.myapplication.altura
import ipvc.estg.myapplication.databinding.ActivityCriarperfilBinding
import ipvc.estg.myapplication.genero
import kotlinx.android.synthetic.main.activity_criarperfil.*

class criarperfil : AppCompatActivity() {

    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criarperfil)

    }
    fun save (view: View) {

        val nome = Name.text.toString()
        val genero = genero.text.toString()
        val age = age.toString()
        val altura = altura.text.toString()
        val pesoa = pesoa.text.toString()
        val mpeso = mpeso.text.toString()
        val pobjetivo = pobjetivo.text.toString()
        val username = username.text.toString()


        database = FirebaseDatabase.getInstance().getReference().child("Users")
        val User = User(nome,genero,age,altura,pesoa,mpeso,pobjetivo,username)
        database.child(username).setValue(User).addOnSuccessListener {

            Toast.makeText(this,"Successfully Saved", Toast.LENGTH_SHORT).show()

        }.addOnFailureListener{

            Toast.makeText(this,"Failed", Toast.LENGTH_SHORT).show()

        }

    }

}

