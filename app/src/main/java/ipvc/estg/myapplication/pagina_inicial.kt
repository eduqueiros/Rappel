package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pagina_inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagina_inicial)
    }
    fun contacta(view: View){
        val contacta = Intent(this, contacta::class.java)
        startActivity(contacta)
    }
}