package com.join.cbbaapp

object tangoConstants3 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<Word> {
        val wordList = ArrayList<Word>()


        val word1 = Word(1, "Q1", R.drawable.icons8mizu, "みず", "ひ", "ミス", "かみ", 1)

        wordList.add(word1)


        val word2 = Word(2, "Q2", R.drawable.icons8denki, "てんき", "でんき", "かいだん", "て", 3)

        wordList.add(word2)

        val word3 = Word(3, "Q3", R.drawable.icons8hi, "みず", "ひ", "は", "かみ", 2)

        wordList.add(word3)

        val word4 = Word(4, "Q4", R.drawable.icons8isu, "からだ", "いず", "いす", "サムライ", 3)

        wordList.add(word4)

        val word5 = Word(5, "Q5", R.drawable.icons8tukue, "つめ", "かいだん", "いす", "つくえ", 4)

        wordList.add(word5)

        val word6 = Word(6, "Q6", R.drawable.icons8beddo, "みみ", "みず", "ベッド", "いす", 3)

        wordList.add(word6)


        val word7 = Word(7, "Q7", R.drawable.icons8kaidan, "かいたん", "て", "トイレ", "かいだん", 4)

        wordList.add(word7)

        val word8 = Word(8, "Q8", R.drawable.icons8doa, "まど", "ドア", "でんき", "て", 2)

        wordList.add(word8)

        val word9 = Word(9, "Q9", R.drawable.icons8mado, "まど", "ノート", "き", "かみ", 1)

        wordList.add(word9)

        val word10 = Word(10, "Q10", R.drawable.icons8toire, "トイレ", "ペン", "あし", "かみ", 1)

        wordList.add(word10)


        return wordList
    }

}




