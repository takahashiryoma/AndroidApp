package com.join.cbbaapp

object readingConstants6 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "", "Q1 2,091636はなんとよみますか", "にひゃくきゅうまんせんろっぴゃくさんじゅうろく", "にひゃくはちまんせんろっぴゃくさんじゅうろく", "にひゃくきゅうまんせんろっぴゃくごじゅうはち", "にひゃくななまんせんろっぴゃくさんじゅうろく", 1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "", "Q2 2日のよみかたはなにですか", "なのか", "ついたち", "みっか", "ふつか", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "", "Q3 かようびのあしたはなんようびですか", "どようび", "にちようび", "すいようび", "もくようび", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "", "Q4 9日のよみかたはなんですか", "むいか", "なのか", "ようか", "ここのか", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "", "Q5 8,000000はなんとよみますか", "はっぴゃくまん", "ななひゃくまん", "ろっぴゃくまん", "さんびゃくまん" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "", "Q6 5日のよみかたはなんですか", "むいか", "いつか" , "なのか", "ようか", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "", "Q7 にちようびのきのうはなんようびですか", "どようび", "かようび", "すいようび", "にちようび", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "", "Q8　200798はなんと読みますか", "よんじゅうまんななひゃくきゅうじゅうはち", "にじゅうまんななひゃくきゅうじゅうきゅう", "さんじゅうまんななひゃくきゅうじゅうはち", "にじゅうまんななひゃくきゅうじゅうはち", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "", "Q9 げつようびとすいようびのあいだはなんようびですか", "かようび", "もくようび", "きんようび", "げつようび", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "", "Q10 6日のよみかたはなんですか", "むいか", "いつか", "みっか", "ふつか" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }



}