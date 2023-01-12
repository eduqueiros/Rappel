package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class macarrao_bacon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_macarrao_bacon)
    }

    fun voltar3(view: View){
        val receitas_engordar = Intent(this, receitas_engordar::class.java)
        startActivity(receitas_engordar)
    }
}