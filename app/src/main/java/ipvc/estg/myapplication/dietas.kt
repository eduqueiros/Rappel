package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import ipvc.estg.myapplication.databinding.ActivityDietasBinding

class dietas : AppCompatActivity() {

    private lateinit var binding : ActivityDietasBinding
    private lateinit var database : DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDietasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.readdataBtn.setOnClickListener {

            val Nome : String = binding.etusername.text.toString()
            if  (Nome.isNotEmpty()){

                readData(Nome)

            }else{

                Toast.makeText(this,"PLease enter the Name of the product", Toast.LENGTH_SHORT).show()

            }

        }

    }

    private fun readData(Nome: String) {

        database = FirebaseDatabase.getInstance().getReference("Produtos")
        database.child(Nome).get().addOnSuccessListener {

            if (it.exists()){

                val nome = it.child("Nome").value
                val descricao = it.child("Descrição").value
                Toast.makeText(this,"Successfuly Read", Toast.LENGTH_SHORT).show()
                binding.etusername.text.clear()
                binding.tvFirstName.text = nome.toString()
                binding.tvLastName.text = descricao.toString()

            }else{

                Toast.makeText(this,"Product Doesn't Exist", Toast.LENGTH_SHORT).show()


            }

        }.addOnFailureListener{

            Toast.makeText(this,"Failed", Toast.LENGTH_SHORT).show()


        }

    }
    fun perfil2(view: View) {
        val perfil = Intent(this, perfil::class.java)
        startActivity(perfil)
    }
    fun saude(view: View){
        val psaude = Intent(this, psaude::class.java)
        startActivity(psaude)
    }
    fun inicial(view: View) {
        val pagina_inicial = Intent(this, pagina_inicial::class.java)
        startActivity(pagina_inicial)
    }

    fun volta(view: View){
        val pagina_inicial = Intent(this, pagina_inicial::class.java)
        startActivity(pagina_inicial)
    }

    fun receitas2(view: View){
        val receitas = Intent(this, receitas::class.java)
        startActivity(receitas)
    }
}