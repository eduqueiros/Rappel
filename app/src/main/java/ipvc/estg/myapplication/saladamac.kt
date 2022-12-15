package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class saladamac : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutreceitassaladamac)
    }
    fun volta(view: View){
        val receitasmanter= Intent(this,manter::class.java)
        startActivity(receitasmanter)
    }
}