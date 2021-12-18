package com.join.cbbaapp

object readingConstants5 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "", "Q1 きんようびのまえのひはなんようびですか", "もくようび", "すいようび", "どようび", "げつようび", 1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "", "Q2 12:10をにほんごでかいてください", "はちじじゅっぷん", "じゅうじじゅっぷん", "じゅうにじにじゅっぷん", "じゅうにじじゅっぷん", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "", "Q3 8日のよみかたはなんですか", "いつか", "ここのか", "ようか", "なのか", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "", "Q4 もくようびのまえのひはなにですか", "げつようび", "かようび", "きんようび", "すいようび", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "", "Q5 3日のよみかたはなんですか", "みっか", "よっか", "ふつか", "ここのか" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "", "Q6 406000はなんとよみますか", "よんじゅうまんまっせん", "よんじゅうまんろくせん" , "よんじゅうまん", "さんじゅうまんごせん", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "", "Q7 10日のよみかたはなんですか", "とおか", "なのか", "ここのか", "ついたち", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "", "Q8　9000000はなんとよみますか", "じゅうまん", "はちじゅうまん", "きゅうじゅうまん", "きゅうひゃくまん", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "", "Q9 げつようびのつぎのひはなんようびですか", "かようび", "すいようび", "もくようび", "きんようび", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "", "Q10 3:47をにほんごでかいてください", "さんじよんじゅうななふん", "さんじよんじゅうはちふん", "よじよんじゅうななふん", "はちじよんじゅうななふん" , 1)
        sentenceList.add(sentence10)


        return sentenceList
    }



}