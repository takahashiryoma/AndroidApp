package com.join.cbbaapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_alllist.*


class AllListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alllist)

        val animalList = listOf<ListWord>(
            ListWord("ごい", R.drawable.icons8word),
            ListWord("ぶんぽう", R.drawable.icons8sentence),
            ListWord("よむ", R.drawable.iconsreading),
            ListWord("ミックステスト", R.drawable.icons8test),
            ListWord("よむ（ちょうぶん）",R.drawable.icons8fukusyuuu)

            )

        recycler_view.adapter = CustomAllListAdapter(animalList,this)
        recycler_view.layoutManager = GridLayoutManager(this, 2, RecyclerView.VERTICAL, false)

    }
}



