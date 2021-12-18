package com.join.cbbaapp

object listenConstants6 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "いえにかえってねた＿＿がいいですよ。", "ほう", "より", "のが", "かみ", 1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2, "Q2", "おかあさん。もうあそびに＿＿＿もいいですか？", "いっては", "いっても", "いっと", "いって", 4)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "あなたのかみは＿＿＿＿よ。", "ながいよ", "ながくない", "なが", "ながすぎです", 4)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "わたしはこれから＿＿＿にいきます。", "およぐ", "およぎ", "およ", "およぐ", 2)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "せんせいはどこにいってるの＿＿。", "だろう", "つもりだ", "から", "かみ", 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "あなたはあそこにいって＿＿いけませんよ。", "あ", "が", "も", "は", 4)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "どれ＿＿ここではたらいていましたか？", "くらい", "まで", "より", "まど", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "わたしはおんがくをきく＿＿すきです。", "が", "のが", "は", "より", 2)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "あしたは＿＿＿いだろう。", "いそがし", "いそ", "いそが", "い", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "わたしのへやはあまり＿＿いではありません。", "き", "きた", "きれい", "きれ", 4)

        sentenceList.add(sentence10)


        return sentenceList
    }
}
