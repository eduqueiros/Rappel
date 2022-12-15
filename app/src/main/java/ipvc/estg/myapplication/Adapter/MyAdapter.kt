package ipvc.estg.myapplication.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ipvc.estg.myapplication.Models.UserM
import ipvc.estg.myapplication.R

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private val userList = ArrayList<UserM>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.dieta_item,
            parent,false
        )
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.Nome.text = currentitem.Nome
        holder.Idade.text = currentitem.Idade

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun updateUserList(userList : List<UserM>){

        this.userList.clear()
        this.userList.addAll(userList)
        notifyDataSetChanged()

    }

    class  MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val Nome : TextView = itemView.findViewById(R.id.tvNome)
        val Idade : TextView = itemView.findViewById(R.id.tvIdade)


    }

}