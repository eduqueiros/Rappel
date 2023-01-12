package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class receitas_manter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas_manter)
    }

    fun espinafre(view: View){
        val omelete_espinafre = Intent(this, omelete_espinafre::class.java)
        startActivity(omelete_espinafre)
    }
}