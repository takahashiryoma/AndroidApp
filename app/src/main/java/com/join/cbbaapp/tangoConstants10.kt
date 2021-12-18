package com.join.cbbaapp

object tangoConstants10 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "ភ្លឺ", "あかるい", "くらい", "あきるい", "かみ", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "ងងឹត", "つらい", "あかるい", "くらい", "ねる", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "រវល់", "あかるい", "いそがしい", "つらい" , "ねる" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "ទំនេរ", "つめたい", "まひ", "ひま", "いそがしい", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "ធាត់", "みる", "あつい", "ひま", "ふとっている", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ស្គម", "くらい", "ふとっている", "やせている", "よむ", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ក្មេង", "あるく", "みじかい", "つめたい", "わかい", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "ចាស់", "わかい", "としをとっている" , "いそがしい", "おじいちゃん", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "ក្ដៅ", "あつい","すずしい", "さむい", "はしる", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "មក", "さむい", "あつい", "たつ", "ひま", 1)

        wordList.add(word10)


        return wordList
    }

}


