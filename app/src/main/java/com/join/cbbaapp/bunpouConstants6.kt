package com.join.cbbaapp

object bunpouConstants6 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "どれ＿＿あなたのほんですか？", "が", "ぐ", "に", "も", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "ペンはそこ＿＿おいてください。", "み", "で", "が", "に", 4)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "これ＿＿にくです。", "は", "で", "に", "だ", 1)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "スーパー＿＿かいものをしました。", "み", "を", "が", "で", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "いぬが2ひきいます。ねこ＿＿2ひきいます。", "み", "て", "も", "か", 3)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "おはようはにほんご＿＿なんといいますか？", "ど", "で", "が", "か", 2)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "わたしはがっこうのまえ＿＿とおります。", "を", "だ", "に", "は", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "わたしはまいにちにほんご＿＿べんきょうします。", "は", "を", "が", "か", 2)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "せんしゅうプノンペン＿＿いきました。", "に", "て", "を", "が", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "あれもすきです。これ＿＿すきです。", "は", "み", "が", "も", 4)

        sentenceList.add(sentence10)


        return sentenceList
    }


}