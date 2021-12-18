package com.join.cbbaapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomReadingAdapter(
    private val readingList: ArrayList<ListWord>, private val context: Context
) : RecyclerView.Adapter<CustomReadingAdapter.ViewHolder>() {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), View.OnClickListener {

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
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.listreading_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val animal = readingList[position]

        viewHolder.image.setImageResource(animal.imageId)
        viewHolder.name.text = animal.name

        viewHolder.itemView.setOnClickListener {
            var intent = Intent(context, ReadingQuiz1::class.java)

            if (position == 0) {
                intent = Intent(context, ReadingQuiz1::class.java)
            }
            if (position == 1) {
                intent = Intent(context, ReadingQuiz2::class.java)
            }
            if (position == 2) {
                intent = Intent(context, ReadingQuiz3::class.java)
            }
            if (position == 3) {
                intent = Intent(context, ReadingQuiz4::class.java)
            }
            if (position == 4) {
                intent = Intent(context, ReadingQuiz5::class.java)
            }
            if (position == 5) {
                intent = Intent(context, ReadingQuiz6::class.java)
            }
            if (position == 6) {
                intent = Intent(context, ReadingQuiz7::class.java)
            }
            if (position == 7) {
                intent = Intent(context, ReadingQuiz8::class.java)
            }
            if (position == 8) {
                intent = Intent(context, ReadingQuiz9::class.java)
            }
            if (position == 9) {
                intent = Intent(context, ReadingQuiz10::class.java)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = readingList.size
}

