package com.join.cbbaapp

object listenConstants5 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()



        val sentence1 = sentence(1, "Q1", "このペンは＿＿しいです。", "あたら", "あた", "あたらし", "あ", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "わたしは＿＿いいえがすきです。", "ふみ", "ふるい", "ふ", "ふる", 4)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "わたしは＿＿いものはたべれません。", "から", "か", "からい", "かり", 1)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "子どもは＿＿ものがすきです。", "あま", "あまい", "あ", "あみ", 2)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "やさいは＿＿いです", "にが", "にがい", "にげ", "に", 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "にほんごは＿＿しいです。", "むずかしい", "む", "むずか", "むず", 3)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "わたしはまだ＿＿です。", "わかい", "わか", "わ", "わきい", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "このペンは10mあります。＿＿です。", "なが", "ながい", "ながいい", "なぬ", 2)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "このペンは5cmです。＿＿です。", "みじかい", "みじ", "み", "みじきい", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "このへやは＿＿ないです。", "き", "きた", "きたない", "きみ", 2)

        sentenceList.add(sentence10)


        return sentenceList
    }

}