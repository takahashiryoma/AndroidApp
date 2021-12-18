package com.join.cbbaapp

object listenConstants3 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "ម្សិលមៃ្ង", "おととい", "きょう", "きのう", "さくじつ",1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2,  "Q2", "ម្សិលមិញ", "はらたく", "あした", "さくじつ", "きのう",4)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "ថ្ងៃនេះ", "かえす", "さくじつ", "きょう", "きのう", 3)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "សែ្អក", "のむ", "さくじつ", "きょう", "あした", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "ខាងស្អែក", "あさって", "あした", "きのう", "きょう" , 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "ថ្ងៃមុន", "〇〇にちご", "〇〇にちまえ" , "あさって", "きのう", 2)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "ថ្ងៃក្រោយ", "〇〇にちご", "〇〇にちまえ", "さくじつ", "きのう", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "រាល់ថ្ងៃ", "ご", "あさって", "あした", "まいにち", 4)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "អាទិត្យមុន", "せんしゅう", "せんせんしゅう", "まいにち", "きのう", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "អាទិត្យនេះ", "こんしゅう", "せんしゅう", "きょう", "きのう" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }

}
