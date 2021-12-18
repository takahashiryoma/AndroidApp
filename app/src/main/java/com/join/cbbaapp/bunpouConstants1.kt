package com.join.cbbaapp

object bunpouConstants1 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "あしたがっこうへほんを＿＿にいきます。", "かり", "かりる", "かりた", "かりる", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "わたしはにほんで＿＿きます。", "はたら", "はらた", "はしら", "はた", 1)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "あしたのあさ、いえに＿＿ります。", "かえし", "いき", "かえ", "か", 3)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "わたしはサムライを＿＿ます。", "のま", "たべ", "のむ", "のみ", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "せんせいはほんを＿＿ます。", "よみ", "よむ", "よま", "のみ" , 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "にほんじんはよくサムライを＿＿ます。", "かいま", "かい" , "か", "かみ", 2)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "わたしはノートにひらがなを＿＿きます。", "か", "かき", "み", "さ", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "わたしはよくうたを＿＿ます。", "か", "かき", "うた", "うたい", 4)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "わたしはにほんのせんせいにりょうりを＿＿ます。", "つくり", "つき", "のみ", "かみ", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "にほんのりょうりが＿＿です。", "すき", "すか", "つき", "たき" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }

}