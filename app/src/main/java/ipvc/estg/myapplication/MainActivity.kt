package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.core.view.View

class MainActivity : AppCompatActivity() {

    //private lateinit var iniciarsessao : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //iniciarsessao = findViewById(R.id.iniciarsessao)

        //iniciarsessao.setOnClickListener{
        //   val intent = Intent(this, Sessao::class.java)
        //   startActivity(intent)
        //}
        fun sessao(view: View){
            val sessao = Intent(this, Sessao::class.java)
            startActivity(sessao)

        }




    }


}

