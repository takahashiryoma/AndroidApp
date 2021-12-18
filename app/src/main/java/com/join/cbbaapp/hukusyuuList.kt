package com.join.cbbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_hukusyuu_list.*

class hukusyuuList : AppCompatActivity(), View.OnClickListener {

    private lateinit var mAdapter: CustomHukusyuuAdapter
    private lateinit var mSentenceList: ArrayList<ListWord>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hukusyuu_list)

        ibBack.setOnClickListener(this)

        val sentence1 = ListWord("リーディングテスト", R.drawable.cbb)
        val sentence2 = ListWord("リーディングテスト", R.drawable.cbb)
        val sentence3 = ListWord("リーディングテスト", R.drawable.cbb)
        val sentence4 = ListWord("リーディングテスト", R.drawable.cbb)
        val sentence5 = ListWord("リーディングテスト", R.drawable.cbb)

        mSentenceList =
            arrayListOf(sentence1, sentence2,sentence3, sentence4, sentence5)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        mAdapter = CustomHukusyuuAdapter(mSentenceList,this)
        recyclerView.adapter = mAdapter


    }

    override fun onClick(v: View) {

        if (v.id == R.id.ibBack) {
            val intent = Intent(this, AllListActivity::class.java)
            startActivity(intent)
        }
    }

}

