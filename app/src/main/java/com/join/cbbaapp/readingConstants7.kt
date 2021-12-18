package com.join.cbbaapp

object readingConstants7 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "わたしはがくせいです。おにいさんはエンジニアです。", "Q1 おにいさんのしょくぎょうは何ですか？", "エンジニア", "けいさつかん", "しゅふ", "がくせい", 1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "わたしはフィリピンに行きたいです。ともだちはアメリカに行きたいです。", "Q2 わたしが行きたいくにはどこですか？", "かんこく", "イギリス", "アメリカ", "フィリピン", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "わたしはきのう、えいがかんに行きました。きょうは、ラーメンやに行きました。", "Q3 私はきょう、どこに行きましたか。", "えいがかん", "コンビニ", "ラーメンや", "ケーキや", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "今ははるです。はるのつぎは＿です", "Q4 ＿にはるのはなにですか？", "ふゆ", "あき", "はる", "なつ", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "いもうとのむすこは＿です", "Q5 ＿にはるのはなにですか？", "おい", "そふ", "ちち", "おじ" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "つくえのうえにはねこが2ひきいます。つくえのしたにはニワトリが2わいます。", "Q6 つくえのしたにいるのはなにですか？", "さかな", "ニワトリ" , "いぬ", "ねこ", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "わたしはスーツをきました。おかあさんはきものをきました。", "Q7 おかあさんはなにをきましたか？", "きもの", "スカート", "てぶくろ", "Tシャツ", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "わたしはひるごはんにスパゲティをたべました。よるごはんにはピザをたべました。", "Q8　わたしはひるごはんになにをたべましたか？", "カレー", "パスタ", "ピザ", "スパゲティ", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "わたしはきょう、やきゅうをします。あしたはあめなので、たっきゅうをします。", "Q9 わたしはあした、なにをしますか？", "たっきゅう", "やきゅう", "サッカー", "やきゅう", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "わたしはともだちにノートをかしました。わたしはともだちにシャーペンをかりました。", "Q10 わたしはなにをともだちにかりましたか？", "シャーペン", "ボールペン", "はさみ", "のり" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }



}