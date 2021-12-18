package com.join.cbbaapp

object tangoConstants6 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "រៀន", "べんきょうする", "はらたく", "しめる", "きょうべんする", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "បែកគ្នា", "いく", "あう" , "わかれる", "ねる", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "បើក", "しめる", "あける", "かむ" , "たべる" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "បិទ", "みる", "あける", "しまる", "かく", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "ឱ្យ/ហុច", "わたし", "かい", "みる", "わたす", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "លេង", "あそび", "あそ", "あそぶ", "みる", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ចលាង", "あるく", "いく", "すき", "あらう", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "មាន", "すむ", "ある", "すみません", "ぽん", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "ត្រូវការ", "いる","おばけ", "こわい", "にげる", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "ឈប់", "とまる", "いく", "にげる", "うたう", 1)

        wordList.add(word10)


        return wordList
    }

}


