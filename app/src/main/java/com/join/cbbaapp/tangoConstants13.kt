package com.join.cbbaapp

object tangoConstants13 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "ពេល", "あさ", "ひる", "かようび", "さくじつ", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "ពេលថ្ងៃ", "げつようび", "おととい", "ひる", "あさ", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "ពេលយ៉ប", "きのう", "よる", "あさ" , "きんようび" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "មុននេះបន្តិច", "あさ", "よる", "さっき", "きのう", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "ឥឡូវ", "あさ", "きのう", "さっき", "いま", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ក្រោយ", "ひる", "げつようび", "あとで", "さっき", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "ម៉ាន", "すいようび", "よる", "さっき", "じかん", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "ថ្ងៃអាទិត្យ", "かようび", "にちようび" , "きのう", "ぽん", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "ថ្ងៃពុធ", "すいようび","きのう", "きょう", "こんしゅう", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "ថ្ងៃសៅរ៍", "どようび", "かようび", "らいしゅう", "さっき", 1)

        wordList.add(word10)


        return wordList
    }

}


