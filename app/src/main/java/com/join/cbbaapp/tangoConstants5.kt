package com.join.cbbaapp

object tangoConstants5 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "ក្រោក", "おきる", "はらたく", "およぐ", "ねる", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "ដេក", "たべる", "きる", "ねる", "おきる", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "ញុំា", "のむ", "たべる", "かむ", "ためる", 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "ញុំា", "みない", "つくる", "みる", "かく", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "បញ្ហា", "みる", "かい", "うる", "こまる", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ជួប", "しめる", "いく", "あう", "あい", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ចាប់ផើ្តម", "うごく", "とまる", "おわる", "はじまる", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "ចូលចិត្ត", "とまる", "すき", "きらい", "て", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "ឱ្យ", "あげる", "つくる", "ねる", "はしる", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "បញ្ចូល", "いれる", "いく", "スティング", "ころぶ", 1)

        wordList.add(word10)


        return wordList
    }

}