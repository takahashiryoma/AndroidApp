package com.join.cbbaapp

object listenConstants10 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "私はめがねをかけました。ともだちはぼうしをかぶりました。", "Q1  ともだちがみにつけたものはなにですか？"  ,"ぼうし", "サングラス", "くつ", "メガネ",  1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "なつやすみ、わたしとともだちは＿でおよぎました。", "Q2 ＿にはいるものは？", "はな", "そら", "やま", "うみ", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "私のお母さんのお兄さんは＿です", "Q3 ＿に入るものは？", "おねえさん", "きょうだい", "おじ", "まご", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "わたしのおかあさんはぎんこういんです。わたしのおとうさんはせんせいです。", "Q4 わたしのおとうさんのしょくぎょうは？", "かしゅ", "ぎんこういん", "いしゃ", "せんせい", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "かおには、めやはな、くちなどがあります。", "Q5 かおにないものは？", "うで", "くち", "みみ", "はな" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "きのうはカレーライスをたべました。きょうはうどんをたべました。", "Q6 きょうはなにをたべましたか？", "　ばんごはん", "カレーライス" , "うどん", "おにぎり", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "A:すみません。あのうえにあるペンをみたいです。（ア）。B: わかりました。", "Q7 ふでばこには、ボールペンが2本、消しゴムが1つ入っています。", "ボールペン", "けしごむ", "かみ", "りんご", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "わたしはは＿でひるごはんを作りました。", "Q8＿にはいるものは？", "ドア", "ほんだな", "やね", "だいどころ", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "きのう、わたしははでんしゃとバスでがっこうまでいきました。", "Q9 きのう、わたしはでんしゃとなににのりましたか？", "バス", "じでんしゃ", "ひこうき", "ふね", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "わたしはコーヒーをのみました。おねえさんはおちゃをのみました。", "Q10 おねえさんはなにをのみましたか？", "お茶", "コーヒー", "みず", "スープ" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }

}
