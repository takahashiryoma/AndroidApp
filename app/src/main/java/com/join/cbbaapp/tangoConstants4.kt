package com.join.cbbaapp

object tangoConstants4 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "ធ្វើការ", "はたらく", "はらたく", "およぐ", "かみ", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "ត្រឡប់", "いく", "はたらく", "かえる", "ねる", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "ផឹក", "たべる", "のむ", "かむ" , "ねる" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "អាន", "みる", "つくる", "よむ", "かく", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "ទិញ", "みる", "かい", "うる", "かう", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "សរសេរ", "あける", "いく", "かく", "よむ", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ច្រៀង", "あるく", "とまる", "うごく", "うたう", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "បង្កើត/ ធ្វើ", "とまる", "つくる", "うごく", "て", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "និយាយ", "いう","つくる", "あるく", "はしる", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "មក", "くる", "いく", "たつ", "すわる", 1)

        wordList.add(word10)


        return wordList
    }

}


