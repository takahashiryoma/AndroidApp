package com.join.cbbaapp

object tangoConstants8 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "ធំ", "おおきい", "ちいさい", "みみ", "あかるい", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "តូច", "いく", "おおきい", "ちいさい", "ちいさ", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "ច្រើន", "おおきい", "おおい", "おおう" , "ねる" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "តិច", "すくなう", "つくる", "すくない", "すくなう", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "ថ្លៃ", "みる", "たか", "すくない", "たかい", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ថោក", "おおきい" , "やすお", "やすい", "よむ", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ថ្មី", "あるく", "あらたしい", "やすい", "あたらしい", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "ចាស់", "あたらしい", "ふるい", "うごく", "こわい", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "ខ្លាំង", "つよい","よわい", "すくない", "はしる", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "ខ្សោយ", "よわい", "いく", "たつ", "つよい", 1)

        wordList.add(word10)


        return wordList
    }

}


