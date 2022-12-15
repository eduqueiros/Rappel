package ipvc.estg.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class receitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas)
    }

    fun engordar(view: View){
        val engordar= Intent(this,engordar::class.java)
        startActivity(engordar)
    }

    fun manter(view: View){
        val manter= Intent(this,manter::class.java)
        startActivity(manter)
    }

    fun emagrecer(view: View){
        val emagrecer= Intent(this,emagrecer::class.java)
        startActivity(emagrecer)
    }

}



