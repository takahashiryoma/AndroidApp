package com.join.cbbaapp

object listenConstants1 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "ធ្វើការ", "はたらく", "はらたく", "かりる", "うごく",1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2,  "Q2", "ត្រឡប់", "はらたく", "べんきょうする", "くる", "かえる",4)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "ផឹក", "かえす", "いく", "のむ", "およぐ", 3)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "អាន", "のむ", "たべる", "のむ", "よむ", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "ទិញ", "かう", "よむ", "べんきょうする", "あける" , 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "សរសេរ", "かう", "かく" , "およぐ", "しめる", 2)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "ច្រៀង", "うたう", "かく", "みる", "さがす", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "បង្កើត/ ធ្វើ", "か", "かく", "うたう", "つくる", 4)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "និយាយ", "いう", "しめる", "たべる", "かみ", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "មក", "くる", "すき", "かえる", "たく" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }

}
