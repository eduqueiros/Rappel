package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ipvc.estg.myapplication.DB.User
import ipvc.estg.myapplication.databinding.ActivityMainBinding
import ipvc.estg.myapplication.databinding.GeneroBinding

class genero : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genero)
    }
    fun nascimento(view: View){
        val idade = Intent(this, idade::class.java)
        startActivity(idade)
    }
}