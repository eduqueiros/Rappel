package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class omelete_espinafre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_omelete_espinafre)
    }

    fun voltar3(view: View){
        val receitas_manter = Intent(this, receitas_manter::class.java)
        startActivity(receitas_manter)
    }
}