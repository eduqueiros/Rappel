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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun criarperfil(view: View){
        val genero = Intent(this, genero::class.java)
        startActivity(genero)
    }
    fun sessao(view: View){
        val logingoogle = Intent(this, logingoogle::class.java)
        startActivity(logingoogle)
    }
}