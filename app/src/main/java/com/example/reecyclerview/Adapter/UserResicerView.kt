package com.example.reecyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.reecyclerview.R
import com.example.reecyclerview.model.User


class UserResicerView:RecyclerView.Adapter<UserResicerView.UesrViewHolder>(){
    var userList:ArrayList<User> = ArrayList()

    fun setList(userlist2:ArrayList<User>)
    {
        this.userList=userlist2
        notifyDataSetChanged()

    }

    class UesrViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var Tv_imge:ImageView=itemView.findViewById(R.id.imageView)
        var Tv_textview:TextView=itemView.findViewById(R.id.textView3)

        fun bind(user:User)
        {
            Tv_imge.setImageResource(user.imageId)
            Tv_textview.text=user.Name

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UesrViewHolder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.list_ithem,parent,false)
        return UesrViewHolder(view)
    }

    override fun getItemCount(): Int {
     return userList.size
    }

    override fun onBindViewHolder(holder: UesrViewHolder, position: Int) {
        var user:User=userList.get(position)
        holder.bind(user)
    }
}

