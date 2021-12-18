package com.join.cbbaapp

object tangoConstants9 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "ក្ដៅ", "あつい", "おおい", "あとい", "かみ", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "ត្រជាក់", "いく", "ねる", "すずしい", "あつい", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "ធ្ងន់", "あつい", "おもい", "おもう" , "ねる" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "ស្រាល", "はやい", "つくる", "かるい", "おおい", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "វែង", "みる", "おもい", "なかい", "ながい", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ខ្លី", "あける", "みしかい", "みじかい", "かるい", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ជិត", "あるく", "ながい", "みじかい", "ちかい", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "ឆ្ងាយ", "ちかい", "とおい", "うごく", "て", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "លឿន", "はやい","おそい", "ぱやい", "とおい", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "ឆាប់", "はやい", "いく", "とおい", "はや", 1)

        wordList.add(word10)


        return wordList
    }

}


