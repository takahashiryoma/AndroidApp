package com.join.cbbaapp

object bunpouConstants2 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "きのうはあさ5じに＿＿ました", "おき", "お", "おきて", "おか", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "せんしゅうは9じに＿＿ました。" , "ねる", "ね", "ねみ", "な", 2)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "きょうはあさにパンをたべ＿＿。", "ました", "ます", "ません", "まちた", 1)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "せんしゅうのにちようびにテレビを＿＿した。", "みみ", "みて", "みま", "み", 3)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "せんせいは6じにでかけ＿＿。", "ました", "ます", "る", "ない", 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "わたしはすでにシャワーをあびま＿＿。", "ました", "せん", "す", "した", 4)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "せんせいはじゅぎょうを＿＿ました。", "はじめ", "はじ", "はじ", "は", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "わたしはともだちににほんごをおしえ＿＿。", "ない", "ています。", "ました", "る", 3)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "せんせいはせいとにぺんを＿＿ました。", "あげた", "あげ", "あ", "あみ", 2)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "わたしはおおきなこえでわらいま＿＿。", "した", "た", "せん", "った", 1)

        sentenceList.add(sentence10)


        return sentenceList
    }
}
