package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class frangosalteado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutreceitasfrangosalteado)
    }
    fun volta(view: View){
        val emagrecer= Intent(this,emagrecer::class.java)
        startActivity(emagrecer)
    }
}