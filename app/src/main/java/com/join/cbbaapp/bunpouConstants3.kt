package com.join.cbbaapp

object bunpouConstants3 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "CBBスクールはかなり＿＿です。", "おおきい", "おおき", "おお", "かみ", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "ねこはいぬより＿＿です。", "ちいさい", "ちい", "ちいさ", "ちみ", 1)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "パソコンはねだんが＿＿いです。", "たけ", "たかい", "た", "たか", 4)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "サムライはねだんが＿＿いです。", "やすい", "やす", "や", "やさ" , 2)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "子どもはしんちょうが＿＿いです。", "ひく", "ひ", "やす", "かみ", 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "わたしは＿＿ものがすきです。", "いい", "い", "いいい", "いや", 1)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "＿＿いものはいらないです。", "わる", "わ", "わるい", "かみ", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "にほんとカンボジアは＿＿いです。", "と", "とお", "とおお", "とう", 2)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "いえからプノンペンは＿＿いです。", "ちかあ", "ちかい", "ち", "ちか", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "せんせいはいつも＿＿いです。", "いそがし", "いそが", "いぞがじ", "いそ", 1)

        sentenceList.add(sentence10)


        return sentenceList
    }


}