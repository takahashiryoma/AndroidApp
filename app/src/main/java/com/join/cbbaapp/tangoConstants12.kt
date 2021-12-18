package com.join.cbbaapp

object tangoConstants12 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord() : ArrayList<sentence> {
        val wordList = ArrayList<sentence>()


        val word1 = sentence(1, "Q1", "អរុណសួស្ដី", "おはようございます", "こんばんわ", "こんにちは", "さくじつ", 1)

        wordList.add(word1)


        val word2 = sentence(2, "Q2", "សួស្ដី", "こんにち", "おはようございます", "こんにちは", "きょう", 3)

        wordList.add(word2)

        val word3 = sentence(3, "Q3", "សាយ័ន្ដសួស្ដី", "おはようございます", "こんばんわ", "こんにちは" , "こんば" , 2)

        wordList.add(word3)

        val word4 = sentence(4, "Q4", "សូមអរគុណ", "せんげつ", "はじめまして", "ありがとうございます", "こんばんわ", 3)

        wordList.add(word4)

        val word5 = sentence(5, "Q5", "សូមទោស", "おはようございます", "きのう", "こんにちは", "ごめんなさい", 4)

        wordList.add(word5)

        val word6 = sentence(6, "Q6", "ជំរាបសួរ", "ひさしぶりです", "こんばんわ", "はじめまして", "こんにちは", 3)

        wordList.add(word6)


        val word7 = sentence(7, "Q7", "សុខសប្បាយជាទេ", "なにしてますか", "まいにち", "はじめまして", "おげんきですか", 4)

        wordList.add(word7)

        val word8 = sentence(8, "Q8", "សុខសប្បាយ", "げんきですか", "げんきです" , "はじめまして", "こんばんわ", 2)

        wordList.add(word8)

        val word9 = sentence(9, "Q9", "ជំម្រាបលា", "さようなら","げんきです", "きょう", "こんにちは", 1)

        wordList.add(word9)

        val word10 = sentence(10, "Q10", "រាត្រីសួស្ដី", "おやすみなさい", "おはよう", "こんばんわ", "ひま", 1)

        wordList.add(word10)


        return wordList
    }

}


