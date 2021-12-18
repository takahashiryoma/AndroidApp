package com.join.cbbaapp

object tangoConstants1 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<Word> {
        val wordList = ArrayList<Word>()


        val word1 = Word(1, "Q1", R.drawable.mimi, "みみ", "て", "あし", "かみ", 1)

        wordList.add(word1)


        val word2 = Word(2, "Q2", R.drawable.mouth, "つめ", "かみ", "くち", "て", 3)

        wordList.add(word2)

        val word3 = Word(3, "Q3", R.drawable.hand, "くち", "て", "あし", "かみ", 2)

        wordList.add(word3)

        val word4 = Word(4, "Q4", R.drawable.leg, "からだ", "て", "あし", "はな", 3)

        wordList.add(word4)

        val word5 = Word(5, "Q5", R.drawable.hair, "つめ", "て", "あし", "かみ", 4)

        wordList.add(word5)

        val word6 = Word(6, "Q6", R.drawable.eye, "みみ", "て", "め", "かみ", 3)

        wordList.add(word6)


        val word7 = Word(7, "Q7", R.drawable.nose, "みみ", "て", "あし", "はな", 4)

        wordList.add(word7)

        val word8 = Word(8, "Q8", R.drawable.body, "みみ", "からだ", "あし", "て", 2)

        wordList.add(word8)

        val word9 = Word(9, "Q9", R.drawable.head, "あたま", "はな", "め", "かみ", 1)

        wordList.add(word9)

        val word10 = Word(10, "Q10", R.drawable.arm, "うで", "て", "あし", "かみ", 1)

        wordList.add(word10)


        return wordList
    }

}

