package com.join.cbbaapp

object readingConstants8 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "私はコーヒーをのみました。おねえさんはおちゃをのみました。", "Q1　おねえさんは何をのみましたか？", "おちゃ", "コーヒー", "みず", "スープ", 1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "きのう、私はでんしゃとバスでかいしゃまでいきました。", "Q2 きのう、私はでんしゃと何にのりましたか？", "ふね", "ひこうき", "じてんしゃ", "バス", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "私は＿で昼ごはんをつくりました。", "Q3 ＿に入るものは？", "やね", "ほんだな", "だいどころ", "ドア", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "", "Q4 いつごはんをたべますか？", "おいしいです", "あなたです", "ここです", "いまたべます", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "", "Q5 どこでごはんをたべますか？", "いえでごはんをたべます", "ここはいえです", "これはごはんです", "5じにごはんをたべます" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "", "Q6 あなたは何がきらいですか？", "バレーがすきです", "サッカーはきらいです" , "これはペンです", "ワタシはポンです", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "", "Q7 なぜサムライが好きですか？", "あまいからです", "とおいからです", "いちばにいきます", "これはサムライです", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "", "Q8　どうやってにほんに行きますか？", "ひこうきはすきです", "これはひこうきです", "にほんはちかいですね", "ひこうきでいきます", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "", "かれの家はどこですか？", "CBBのちかくです", "これはいえです", "いまは４じです", "なぜならCBBです", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "", "あの人はだれですか？", "おとうさんです", "これはにくです", "いまは3じです", "私はポンです" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }



}