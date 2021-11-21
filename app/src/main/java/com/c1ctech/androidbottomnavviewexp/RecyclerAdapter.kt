package com.c1ctech.androidbottomnavviewexp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder> (){
/*
    private val fio= arrayOf("Kristin Marricano","Bill Phillips","Jon Rid")
    private val post= arrayOf("director","engineer","secretary")
    private  val phone=arrayOf("123456","135791","246802")
 */
    data class Worker(
        val fio: String,
        val post:String,
        val phone:String
    )
    private val workerList:List<Worker> = listOf(
        Worker("Kristin Marricano","director","123456"),
        Worker("Bill Phillips","engineer","135791"),
        Worker("Jon Rid","secretary","246802")
)
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemFio:TextView= itemView.findViewById(R.id.fio)
        var itemPost:TextView= itemView.findViewById(R.id.post)
        var itemPhone:TextView= itemView.findViewById(R.id.phone)
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_worker, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemFio.text = workerList[i].fio
        viewHolder.itemPost.text = workerList[i].post
        viewHolder.itemPhone.text = workerList[i].phone

    }

    override fun getItemCount(): Int {
        return workerList.size
    }
}