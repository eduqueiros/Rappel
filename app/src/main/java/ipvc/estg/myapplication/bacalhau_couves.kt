package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class bacalhau_couves : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bacalhau_couves)
    }
    fun voltar3(view: View){
        val receitas_emagrecer = Intent(this, receitas_emagrecer::class.java)
        startActivity(receitas_emagrecer)
    }
}