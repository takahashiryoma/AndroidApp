package com.join.cbbaapp

object tangoConstants14 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "អាទិត្យមុន", "せんしゅう", "きょう", "しゅう", "さくじつ", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "អាទិត្យនេះ", "きのう", "おととい", "こんしゅう", "せんしゅう", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "រាល់អាទិត្យ", "あさ", "まいしゅう", "こんげつ" , "らいねん" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "〇〇ខែមុន", "あさ", "きのう", "〇〇げつまえ", "〇〇ねんまえ", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "〇〇ខែក្រោយ", "さっき", "ひる", "〇〇げつまえ", "〇〇げつご", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "រាល់ឆ្នាំ", "こんげつ", "こんしゅう", "まいとし", "せんしゅう", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ឆ្នាំក្រោយ", "あるく", "まいつき", "きょねん", "らいねん", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "ឆ្នាំមុន", "ことし", "きょねん" , "こんげつ", "らいねん", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "ពីរឆ្នាំក្រោយ", "さらいねん","らいねん", "あさ", "こんしゅう", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "ខែក្រោយ", "らいげつ", "せんしゅう", "らいしゅう", "ひま", 1)

        wordList.add(word10)


        return wordList
    }

}



