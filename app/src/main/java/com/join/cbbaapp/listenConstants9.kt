package com.join.cbbaapp

object listenConstants9 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "私はスーツをきました。おかあさんはきものをきました。", "Q1 おかあさんは何をきましたか？", "きもの", "スーツ", "てぶくろ", "スカート", 1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "今はなつです。なつのつぎは＿です。", "Q2 ＿に入るのは何ですか？", "ふゆ", "はる", "なつ", "あき", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "私はにほんに行きたいです。友だちはカンボジアに行きたいです。おかあさんはフィリピンに行きたいです。", "Q3 私が行きたいくにはどこですか？", "フィリピン", "カンボジア", "にほん", "アメリカ", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "私はきのう、カラオケに行きました。きょうは、すしやに行きました。", "Q4 私はきょう、どこに行きましたか。", "カフェ", "カラオケ", "ラーメンや", "すしや", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "私はぎんこういんです。お兄さんはエンジニアです。", "Q5 私の職業は何ですか？", "ぎんこういん", "けいさつかん", "がくせい", "エンジニア" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "", "Q6 なんじにがっこうに行きますか？", "今は7じです", "7じにいきます" , "あしたは7じです", "がっこうはすきです", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "", "Q7 あなたは何がすきですか？", "がっこうがすきです", "がっこうがきらいです", "これはペンです", "7じ", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "", "Q8　どうやってCBBに来ましたか？", "これはペンです", "CBBに来ました", "8じに来ました", "じてんしゃで来ました", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "", "Q9　いつごはんをたべますか？", "きょうのよるたべます", "ここです", "おいしいです", "おいしくないです", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "", "どこでサムライをかいますか？", "CBBでかいます", "バレーボールがすきです", "いまごはんをたべます", "さかながすきです" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }



}
