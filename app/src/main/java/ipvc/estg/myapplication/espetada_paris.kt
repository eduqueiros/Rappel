package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class espetada_paris : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espetada_paris)
    }

    fun voltar3(view: View){
        val receitas_emagrecer = Intent(this, receitas_emagrecer::class.java)
        startActivity(receitas_emagrecer)
    }
}