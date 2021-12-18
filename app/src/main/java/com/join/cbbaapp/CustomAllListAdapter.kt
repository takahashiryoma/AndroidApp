package com.join.cbbaapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAllListAdapter(private val animalList: List<ListWord>, private val context: Context) :
    RecyclerView.Adapter<CustomAllListAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.image_view)
        val name: TextView = view.findViewById(R.id.text_view)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.alllist_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val animal = animalList[position]
        viewHolder.image.setImageResource(animal.imageId)
        viewHolder.name.text = animal.name

        viewHolder.itemView.setOnClickListener {
            var intent = Intent(context, WordListActivity::class.java)

            if (position == 0) {
                intent = Intent(context, WordListActivity::class.java)
            }
            if (position == 1) {
                intent = Intent(context, SentenceListActivity::class.java)
            }
            if (position == 2) {
                intent = Intent(context, ReadingList::class.java)
            }
            if (position == 3) {
                intent = Intent(context, ListeingList::class.java)
            }
            if (position == 4) {
                intent = Intent(context, hukusyuuList::class.java)
            }
            context.startActivity(intent)
        }

    }

    override fun getItemCount() = animalList.size
}