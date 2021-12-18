package com.join.cbbaapp

object listenConstants4 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "អរុណសួស្ដី", "おはようございます", "こんにちは", "こんばんわ", "こんちわ",1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2,  "Q2", "សួស្ដី", "およぐ", "おはようございます", "こんばんわ", "こんにちは",4)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "សាយ័ន្ដសួស្ដី", "かえす", "あした", "こんばんわ", "おはようございます", 3)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "សូមអរគុណ", "エンジニア", "きょう", "こんにちわ", "ありがとうございます", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "សូមទោស", "ごめんなさい", "あさって", "こんにちわ", "あける" , 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "ជំរាបសួរ", "かう", "はじめまして" , "あさって", "こんばんわ", 2)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "សុខសប្បាយជាទេ", "おげんきですか", "はじめまして", "おはようございます", "さがす", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "សុខសប្បាយ", "あした", "こんにちわ", "はじめまして", "げんきです", 4)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "ជំម្រាបលា", "さようなら", "こんばんわ", "こんにちわ", "かみ", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "រាត្រីសួស្ដី", "おやすみなさい", "はじめまして", "きょう", "たく" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }

}

