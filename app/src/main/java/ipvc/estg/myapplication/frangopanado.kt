package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class frangopanado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutreceitasfrango)
    }
    fun volta(view: View){
        val receitas_engordar= Intent(this,engordar::class.java)
        startActivity(receitas_engordar)
    }
}