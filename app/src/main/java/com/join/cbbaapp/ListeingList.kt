package com.join.cbbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_listeing_list.*

class ListeingList : AppCompatActivity(),View.OnClickListener {

    private lateinit var mAdapter: CustomListeningAdapter
    private lateinit var mSentenceList: ArrayList<ListWord>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listeing_list)

        ibBack.setOnClickListener(this)

        val sentence1 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence2 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence3 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence4 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence5 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence6 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence7 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence8 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence9 = ListWord("ミックステスト", R.drawable.cbb)
        val sentence10 = ListWord("ミックステスト", R.drawable.cbb)
        mSentenceList =
            arrayListOf(sentence1, sentence2,sentence3, sentence4, sentence5, sentence6, sentence7, sentence8, sentence9, sentence10)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        mAdapter = CustomListeningAdapter(mSentenceList,this)
        recyclerView.adapter = mAdapter


    }

    override fun onClick(v: View) {

        if (v.id == R.id.ibBack) {
            val intent = Intent(this, AllListActivity::class.java)
            startActivity(intent)
        }
    }
}
