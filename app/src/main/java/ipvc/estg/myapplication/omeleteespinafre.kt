package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class omeleteespinafre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutreceitasomelete)
    }
    fun volta(view: View){
        val manter= Intent(this,manter::class.java)
        startActivity(manter)
    }
}