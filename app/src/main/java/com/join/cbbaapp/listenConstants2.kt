package com.join.cbbaapp

object listenConstants2 {
    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<sentence> {
        val sentenceList = ArrayList<sentence>()


        val sentence1 = sentence(1, "Q1", "ធំ", "おおきい", "ちいさい", "かわいい", "おいしい",1)

        sentenceList.add(sentence1)

        val sentence2 = sentence(2,  "Q2", "តូច", "ちいさい", "ハンサム", "おおきい", "ちいさい",4)

        sentenceList.add(sentence2)

        val sentence3 = sentence(3, "Q3", "ច្រើន", "かえす", "すくない", "おおい", "かわいい", 3)

        sentenceList.add(sentence3)

        val sentence4 = sentence(4, "Q4", "តិច", "のむ", "たべる", "のむ", "すくない", 4)

        sentenceList.add(sentence4)

        val sentence5 = sentence(5, "Q5", "ថ្លៃ", "たかい", "ひくい", "すくない", "あける" , 1)

        sentenceList.add(sentence5)

        val sentence6 = sentence(6, "Q6", "ថោក", "たかい", "やすい" , "ひくい", "かわいい", 2)

        sentenceList.add(sentence6)

        val sentence7 = sentence(7, "Q7", "ថ្មី", "あたらしい", "きたいない", "かわいい", "あたらしくない", 1)

        sentenceList.add(sentence7)

        val sentence8 = sentence(8, "Q8", "ចាស់", "おおきい", "ハンサム", "あたらしい", "ふるい", 4)

        sentenceList.add(sentence8)

        val sentence9 = sentence(9, "Q9", "ខ្លាំង", "つよい", "よわい", "ちいさい", "おおきい", 1)

        sentenceList.add(sentence9)

        val sentence10 = sentence(10, "Q10", "ខ្សោយ", "よわい", "つよい", "ちいさい", "たく" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }

}

