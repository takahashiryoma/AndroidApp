package com.join.cbbaapp

object tangoConstants2 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<Word> {
        val wordList = ArrayList<Word>()


        val word1 = Word(1, "Q1", R.drawable.kazoku, "かぞく", "かどく", "せんせい", "せんてい", 1)

        wordList.add(word1)


        val word2 = Word(2, "Q2", R.drawable.icons8tomdachi, "ともなち", "せんせい", "ともだち", "かぞく", 3)

        wordList.add(word2)

        val word3 = Word(3, "Q3", R.drawable.icons8otoosan, "おねえさん", "おとうさん（ちち）", "かぞく", "おばあさん", 2)

        wordList.add(word3)

        val word4 = Word(4, "Q4", R.drawable.icons8okaasanpng, "おおくぼさん", "おかみさん", "おかあさん（はは）", "おばあさん", 3)

        wordList.add(word4)

        val word5 = Word(5, "Q5", R.drawable.icons8ani, "おおくぼさん", "おじいさん", "おねえさん", "おにいさん", 4)

        wordList.add(word5)

        val word6 = Word(6, "Q6", R.drawable.icons8oneesan, "ポンさん", "おにいさん", "おねえさん", "おかみさん", 3)

        wordList.add(word6)


        val word7 = Word(7, "Q7", R.drawable.icons8otouto, "おばあさん", "おにいさん", "おねえさん", "おとうと", 4)

        wordList.add(word7)

        val word8 = Word(8, "Q8", R.drawable.icons8imouto, "おとうと", "いもうと", "ともだち", "せんせい", 2)

        wordList.add(word8)

        val word9 = Word(9, "Q9", R.drawable.icons8otoko, "おとこ", "おかま", "かぞく", "おにいさん", 1)

        wordList.add(word9)

        val word10 = Word(10, "Q10", R.drawable.icons8onnna, "おんな", "おとこ", "おとうさん", "おばあさん", 1)

        wordList.add(word10)


        return wordList
    }
}