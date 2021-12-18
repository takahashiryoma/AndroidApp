package com.join.cbbaapp

object listenConstants8 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(
            1,
            "",
            "Q1 すいようびの前の日はなんようびですか",
            "かようび",
            "すいようび",
            "きんようび",
            "もくようび",
            1
        )

        sentenceList.add(sentence1)

        val sentence2 =
            reading(2, "", "Q2 5日のよみ方はなんですか", "みっか", "なのか", "むいか", "いつか", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(
            3,
            "",
            "Q3 もくようびの前の日は何ですか",
            "どようび",
            "にちようび",
            "すいようび",
            "もくようび",
            3
        )

        sentenceList.add(sentence3)

        val sentence4 = reading(
            4,
            "どようびの次の日は何曜日ですか",
            "Q4 どようびの次の日は何曜日ですか？",
            "もくようび",
            "すいようび",
            "げつようび",
            "にちようび",
            4
        )

        sentenceList.add(sentence4)

        val sentence5 = reading(
            5,
            "",
            "Q5 きんようびとすいようびのあいだはなんようびですか？",
            "もくようび",
            "きんようび",
            "かようび",
            "どようび",
            1
        )

        sentenceList.add(sentence5)

        val sentence6 = reading(
            6,
            "",
            "Q6 3日のよみ方はなんですか",
            "よっか",
            "みっか",
            "ここのか",
            "なのか",
            2
        )

        sentenceList.add(sentence6)

        val sentence7 = reading(
            7,
            "",
            "Q7 かようびのあしたはなんようびですか？",
            "すいようび",
            "かようび",
            "どようび",
            "にちようび",
            1
        )

        sentenceList.add(sentence7)

        val sentence8 = reading(
            8,
            "私は友だちにノートをかしました。私は友だちにシャーペンをかりました。",
            "Q8　私は何を友だちにかりましたか？",
            "ノート",
            "ぺん",
            "ほん",
            "シャーペン",
            4
        )

        sentenceList.add(sentence8)

        val sentence9 =
            reading(9, "私はきょう、やきゅうをします。あしたもはれなので、サッカーをします。", "私はあした、何をしますか？", "サッカー", "やきゅう", "バレー", "バスケ", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(
            10,
            "私はひるごはんにやきそばをたべました。よるごはんにはピザをたべました。。",
            "私はひるごはんに何をたべましたか？",
            "やきそば",
            "にく",
            "ベーコン",
            "さかな",
            1
        )

        sentenceList.add(sentence10)


        return sentenceList
    }
}

