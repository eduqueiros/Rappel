package ipvc.estg.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ipvc.estg.myapplication.DB.User
import ipvc.estg.myapplication.databinding.ActivityCriarperfilBinding

class criarperfil : AppCompatActivity() {

    private lateinit var binding : ActivityCriarperfilBinding
    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCriarperfilBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_criarperfil)

        binding.registerBtn.setOnClickListener {

            val name = binding.Name.text.toString()
            val genero = binding.genero.text.toString()
            val age = binding.age.toString()
            val altura = binding.altura.text.toString()
            val pesoa = binding.pesoa.text.toString()
            val mpeso = binding.mpeso.text.toString()
            val pobjetivo = binding.pobjetivo.text.toString()
            val username = binding.username.text.toString()

            database = FirebaseDatabase.getInstance().getReference("Users")
            val User = User(name,genero,age,altura,pesoa,mpeso,pobjetivo,username)
            database.child(username).setValue(User).addOnSuccessListener {

                binding.Name.text.clear()
                binding.genero.text.clear()
                binding.age.text.clear()
                binding.altura.text.clear()
                binding.pesoa.text.clear()
                binding.mpeso.text.clear()
                binding.pobjetivo.text.clear()
                binding.username.text.clear()


                Toast.makeText(this,"Successfully Saved", Toast.LENGTH_SHORT).show()

            }.addOnFailureListener{

                Toast.makeText(this,"Failed", Toast.LENGTH_SHORT).show()

            }

        }

    }
}

