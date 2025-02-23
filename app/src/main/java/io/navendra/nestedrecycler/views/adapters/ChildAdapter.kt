package io.navendra.nestedrecycler.views.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import io.navendra.nestedrecycler.R
import io.navendra.nestedrecycler.models.ChildModel
import kotlinx.android.synthetic.main.child_recycler.view.*

class ChildAdapter(private val children : List<ChildModel>)
    : RecyclerView.Adapter<ChildAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =  LayoutInflater.from(parent.context)
                      .inflate(R.layout.child_recycler,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return children.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]
        //holder.imageButton.setImageResource(child.image)
        holder.titleTextView.text = child.title
        holder.valueTextView.text = child.title
    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val titleTextView : TextView = itemView.title
        //val imageView: ImageView = itemView.child_imageView
        val valueTextView : TextView = itemView.parameter
        val imageButton : ImageButton = itemView.edit_param

    }
}