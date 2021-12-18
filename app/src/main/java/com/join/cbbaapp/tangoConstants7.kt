package com.join.cbbaapp

object tangoConstants7 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "លក់", "うる", "かう", "およぐ", "うら", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "ទិញ", "いく", "うたう", "かう", "うる", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "បើក", "ねる", "うんてんする", "たべる" , "ポン" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "ទុក", "みる", "サムライ", "おく", "たべる", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "យក", "みる", "おきる", "おく", "とる", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ផ្ញើ", "あける", "みる", "おくる", "ねる", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "សង", "あるく", "とまらない", "あげる", "かえす", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "ធ្វើ", "とまる", "おこなう", "うごく", "て", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "រុញ", "おす","みみ", "あるく", "はしる", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "ទាញ", "ひく", "いく", "たつ", "すわる", 1)

        wordList.add(word10)


        return wordList
    }

}


