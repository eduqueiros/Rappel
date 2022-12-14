package ipvc.estg.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Sessao : AppCompatActivity() {

    private lateinit var etUsNome: EditText
    private lateinit var etUsPass: EditText
    private lateinit var btnSubmit: Button

    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sessao)

        etUsNome = findViewById(R.id.nome)
        etUsPass = findViewById(R.id.pass)
        btnSubmit = findViewById(R.id.btnsubm)

        dbRef = FirebaseDatabase.getInstance().getReference("Utilizadores")

        btnSubmit.setOnClickListener{
            saveUserData()
        }
    }

    private fun saveUserData() {

        val userNome = etUsNome.text.toString()
        val userPass = etUsPass.text.toString()

        if(userNome.isEmpty()){
            etUsNome.error = "Por favor introduza o nome"
        }
        if(userPass.isEmpty()){
            etUsPass.error = "Por favor introduza a palavra passe"
        }

        val userId = dbRef.push().key!!

        val user = UserModel(userId, userNome, userPass)

        dbRef.child(userId).setValue(user)
            .addOnCompleteListener{
                Toast.makeText(this, "Dados introduzidos com sucesso", Toast.LENGTH_LONG).show()
            }.addOnFailureListener { err ->
                Toast.makeText(this, "Error ${err.message}", Toast.LENGTH_LONG).show()
            }

    }
}