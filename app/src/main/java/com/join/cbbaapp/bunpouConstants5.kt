package com.join.cbbaapp

object bunpouConstants5 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "にほんじんは＿＿もノートをもっています", "いつ", "いつも", "いち", "い", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "ポンくんは＿＿きていませんよ。", "もう", "まだ", "いつも", "ま", 2)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "ごはんが＿＿ほしいです。", "もっと", "まだ", "もう", "いつも", 1)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "＿＿＿ひとがいないですね。", "もっと", "まだ", "ぜんぜん", "ぜんぜ", 3)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "ここにごはんを＿＿いれてください", "たか", "たく", "たくさ", "たくさん", 4)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "まささんはCBBに＿＿やってきます。", "ときどき", "ときど", "まだ", "たくさん", 1)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "このほんは＿＿よみました", "もお", "も", "まだ", "もう", 4)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "わたしは＿＿＿うたうことがすきです。", "とても", "たくさん", "まだ", "うちえ", 1)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "わたしは＿＿おにくがすきではありません。", "あまり", "あま", "まだ", "たくさん", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "すみません。＿＿はなせますか？", "ゆっくる", "ゆっくりい", "ゆっく", "ゆっくり", 4)

        sentenceList.add(sentence10)


        return sentenceList
    }

}