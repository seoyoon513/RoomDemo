package com.syoon.news.roomdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.syoon.news.roomdemo.databinding.ItemRowBinding

class ItemAdapter(
    private val items: ArrayList<EmployeeEntity>,
    //private val updateListener: (id: Int) -> Unit,
    //private val deleteListener: (id: Int) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root) {
        val tvName = binding.tvItemName
        val tvEmail = binding.tvItemEmail
        val ivEdit = binding.ivEdit
        val ivDelete = binding.ivDelete
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemRowBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val context = holder.itemView.context
        val item = items[position]

        holder.tvName.text = item.name
        holder.tvEmail.text = item.email

        holder.ivEdit.setOnClickListener {
            //updateListener.invoke(item.id)
        }

        holder.ivDelete.setOnClickListener {
            //deleteListener.invoke(item.id)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}