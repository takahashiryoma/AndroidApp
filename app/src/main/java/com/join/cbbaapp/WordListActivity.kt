package com.join.cbbaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_word_list.*


class WordListActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mAdapter: CustomWordAdapter
    private lateinit var mWordList: ArrayList<ListWord>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_list)


        ibBack.setOnClickListener(this)

        val word1 = ListWord("たんごテスト", R.drawable.cbb)
        val word2 = ListWord("たんごテスト", R.drawable.cbb)
        val word3 = ListWord("たんごテスト", R.drawable.cbb)
        val word4 = ListWord("どうしテスト", R.drawable.cbb)
        val word5 = ListWord("どうしテスト", R.drawable.cbb)
        val word6 = ListWord("どうしテスト", R.drawable.cbb)
        val word7 = ListWord("どうしテスト", R.drawable.cbb)
        val word8 = ListWord("けいようしテスト", R.drawable.cbb)
        val word9 = ListWord("けいようしテスト", R.drawable.cbb)
        val word10 = ListWord("けいようしテスト", R.drawable.cbb)
        val word11 = ListWord("ひにち",R.drawable.cbb)
        val word12 = ListWord("あいさつ",R.drawable.cbb)
        val word13 = ListWord("じかん/ようび",R.drawable.cbb)
        val word14 = ListWord("しゅう/げつ/とし",R.drawable.cbb)
        mWordList =
            arrayListOf(word1, word2, word3, word4, word5, word6, word7, word8, word9, word10,word11,word12,word13,word14)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        mAdapter = CustomWordAdapter(mWordList,this)
        recyclerView.adapter = mAdapter


    }

    override fun onClick(v: View) {

        if (v.id == R.id.ibBack) {
            val intent = Intent(this, AllListActivity::class.java)
            startActivity(intent)
        }
    }

}
