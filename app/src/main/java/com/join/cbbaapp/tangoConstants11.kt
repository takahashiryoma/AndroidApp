package com.join.cbbaapp

object tangoConstants11 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "ម្សិលមៃ្ង", "おととい", "きょう", "おとい", "さくじつ", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "ម្សិលមិញ", "きにう", "おととい", "きのう", "きょう", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "ថ្ងៃនេះ", "きのう", "きょう", "おととい" , "ねる" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "សែ្អក", "せんげつ", "きのう", "あした", "ポン", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "ខាងស្អែក", "みる", "きのう", "あした", "あさって", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ថ្ងៃមុន", "〇〇モリモリ", "〇〇にち", "〇〇にちまえ", "〇〇にちご", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ថ្ងៃក្រោយ", "あるく", "まいにち", "〇〇にちまえ", "〇〇にちご", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "រាល់ថ្ងៃ", "きょう", "まいにち" , "きのう", "おじいちゃん", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "អាទិត្យមុន", "せんしゅう","きのう", "きょう", "こんしゅう", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "អាទិត្យនេះ", "こんしゅう", "せんしゅう", "らいしゅう", "ひま", 1)

        wordList.add(word10)


        return wordList
    }

}


