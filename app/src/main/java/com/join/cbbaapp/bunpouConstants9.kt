package com.join.cbbaapp

object bunpouConstants9 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "あしたがっこうへほんを＿＿にいきます。", "かり", "か", "かいに", "かみ", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "わたしはかみ＿＿ふねをつくっています。", "み", "て", "だ", "を", 2)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "あなたはいまじしょを＿＿＿か。", "もっています", "もってきて", "もって", "もっと", 1)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "きのうはあまり＿＿＿です。", "さむいとおもいます", "さむい", "さむ", "さむくなかった", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "まいあさ８じごろいえを＿＿かいしゃへいきます。", "でて", "て", "でた", "でる", 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "にほんりょうりはあまりすき＿＿。", "です", "ではありません", "だ", "でせ", 2)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "きのうははにマフラー＿＿あげました。", "み", "て", "を", "が", 3)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "そのちいさいとけい＿＿ください。", "を", "て", "が", "は", 1)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "にほんごのべんきょうはなんじ＿＿ですか。", "では", "て", "か", "から", 4)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "ナイフ＿＿パンをきりました。", "で", "て", "は", "を", 1)

        sentenceList.add(sentence10)


        return sentenceList
    }


}