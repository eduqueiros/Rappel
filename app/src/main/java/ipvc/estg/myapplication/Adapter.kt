package ipvc.estg.myapplication

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter (private val context : Activity, private val arrayList : ArrayList<Receita>) : ArrayAdapter<Receita>(context, R.layout.receitas_engordar,
    arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View{

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.receitas_engordar,null)


        val imageView : ImageView = view.findViewById(R.id.receitasImagem)
        val nomeReceita : TextView = view.findViewById(R.id.receitasNome)

        imageView.setImageResource(arrayList[position].imageId)
        nomeReceita.text = arrayList[position].name


        return view
    }

}