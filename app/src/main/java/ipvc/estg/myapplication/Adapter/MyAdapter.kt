package ipvc.estg.myapplication.Adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import ipvc.estg.myapplication.Models.UserM
import ipvc.estg.myapplication.R

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewMolder> {

    private val userList = ArrayList<UserM>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewMolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewMolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return userList.size
    }




    class MyViewMolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val Nome : TextView = itemView.findViewById(R.id.tvNome)
        val Idade : TextView = itemView.findViewById(R.id.tvIdade)
    }

}