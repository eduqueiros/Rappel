package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class dietas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dietas)
    }
    fun perfil2(view: View) {
        val perfil = Intent(this, perfil::class.java)
        startActivity(perfil)
    }
}