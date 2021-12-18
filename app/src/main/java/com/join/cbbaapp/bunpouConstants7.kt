package com.join.cbbaapp

object bunpouConstants7 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "せんせいはひとにおしえる＿＿すきです。", "のが", "のは", "が", "のに", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "りんご＿＿3つください。", "は", "を", "が", "も", 2)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "あのみせはなん＿＿いうなまえですか？", "と", "て", "が", "か", 1)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "わたしは30分＿＿まちました。", "で", "が", "を", "ほど", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "1にち＿＿1どクスリをのみます。", "を", "に", "で", "が", 2)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "CBB＿＿2じかんかかります。", "も", "が", "まだ", "まで", 4)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "いつもべんきょうをして＿＿じゅぎょうをうけます。", "より", "て", "まで", "から", 4)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "あたらしいようふく＿＿ほしいです。", "が", "て", "を", "は", 1)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "これはなに＿＿いうたべものですか？", "に", "と", "が", "か", 2)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "にほん＿＿すしはおいしいです。", "の", "て", "が", "か", 1)

        sentenceList.add(sentence10)


        return sentenceList
    }


}