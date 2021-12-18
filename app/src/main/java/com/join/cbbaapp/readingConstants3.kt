package com.join.cbbaapp

object readingConstants3 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "", "Q1 いつごはんをたべますか？", "いまたべます", "ここです", "あなたです", "おいしいです", 1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "", "Q2 どこでべんきょうしますか？", "ありがとう", "ここにあります", "あなたとべんきょうします", "いえでべんきょうします", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "", "Q3 あなたは何が好きですか？", "3じです", "わたしはあそびたいです", "バレーボールがすきです", "すきです", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "", "Q4 どうやってにほんにいきますか？", "にほんはちかいです", "にほんはすきではありません", "にほんにいきたいです", "ひこうきでいきます", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "", "Q5 なぜドリアンが好きですか？", "あまいからです", "とおいからです", "ここがすきです", "わたしはいちばにいきます" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "", "Q6 いついちばにいきたいですか？", "なぜならいきたいからです", "ごはんのまえにいきたいです" , "いちばにいきます", "でんしゃでいきます", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "", "Q7 あのひとはだれですか？", "あのひとはわたしのおにいちゃんです", "どこにいますか？", "なぜならおにいさんです。", "とります。", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "", "Q8 なんじにがっこうにいきますか？", "これはがっこうです。", "がっこうがすきです", "がっこうにいます", "7じにがっこうにいきます", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "", "Q9 あなたのいえはどこですか？", "わたしのいえはいちばのちかくです", "なぜならいちばのちかくです", "いちばにいきます", "5じにがっこうにいきます", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "", "Q10 なにをしたいですか？", "ごはんをたべたいです", "いえにいます", "あのひとはわたしのあねです", "あれはさかなです" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }
}