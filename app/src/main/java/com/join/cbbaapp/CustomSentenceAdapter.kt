package com.join.cbbaapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomSentenceAdapter(
    private val sentenceList: ArrayList<ListWord>,private val context: Context
) : RecyclerView.Adapter<CustomSentenceAdapter.ViewHolder>() {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view),View.OnClickListener {
        val image: ImageView
        val name: TextView

        init {
            image = view.findViewById(R.id.image)
            name = view.findViewById(R.id.name)
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

        }
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.listsentence_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val animal = sentenceList[position]

        viewHolder.image.setImageResource(animal.imageId)
        viewHolder.name.text = animal.name

        viewHolder.itemView.setOnClickListener {
            var intent = Intent(context, bunpouQuiz1::class.java)

            if (position == 0) {
                intent = Intent(context, bunpouQuiz1::class.java)
            }
            if (position == 1) {
                intent = Intent(context, bunpouQuiz2::class.java)
            }
            if (position == 2) {
                intent = Intent(context, bunpouQuiz3::class.java)
            }
            if (position == 3) {
                intent = Intent(context, bunpouQuiz4::class.java)
            }
            if (position == 4) {
                intent = Intent(context, bunpouQuiz5::class.java)
            }
            if (position == 5) {
                intent = Intent(context, bunpouQuiz6::class.java)
            }
            if (position == 6) {
                intent = Intent(context, bunpouQuiz7::class.java)
            }
            if (position == 7) {
                intent = Intent(context, bunpouQuiz8::class.java)
            }
            if (position == 8) {
                intent = Intent(context, bunpouQuiz9::class.java)
            }
            if (position == 9) {
                intent = Intent(context, bunpouQuiz10::class.java)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = sentenceList.size
}

