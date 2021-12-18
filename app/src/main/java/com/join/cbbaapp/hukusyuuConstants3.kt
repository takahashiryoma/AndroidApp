package com.join.cbbaapp

object hukusyuuConstants3 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(
            1,
            "サングラスというのはふつうなつのてんきのいい日にかけるめがねだが、わたしはふゆによくつかう。日本ではふゆによくつよい風がふくからだ。\n" +
                    "\n",
            "この人がサングラスをかけるのはどうしてですか。",
            "風がつよいからです",
            "さむいからです",
            "てんきがいいからです",
            "あついからです",
            1

        )

        sentenceList.add(sentence1)

        val sentence2 =
            reading(2, "先月わたしは学校の友達といっしょに、おきなわへ旅行に行きました。わたしたちは、旅行の前に、おきなわから来た日本人の友達にいろいろ（ア）。友達は、「おきなわはとうきょうよりずっと南だから、とても暑いよ。（イ）、夏の服をたくさん持っていったほうがいい」と言いました。そのころとうきょうはまだ４月だったので、きおんが１４どぐらいでした。（ウ）、わたしはおしいれのおくから、夏の洋服を出して、かばんにいっぱい入れて出かけることにしました。２はく３日の旅行ですが、一日中、おきなわの町をけんぶつしたり、海で泳いだりするので、ようふくはたくさんあったほうがいいと思ったのです。", "Q2 （ア）には何を入れますか。", "話しました", "答えました", "呼びました", "聞きました", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(
            3,
            "先月わたしは学校の友達といっしょに、おきなわへ旅行に行きました。わたしたちは、旅行の前に、おきなわから来た日本人の友達にいろいろ（ア）。友達は、「おきなわはとうきょうよりずっと南だから、とても暑いよ。（イ）、夏の服をたくさん持っていったほうがいい」と言いました。そのころとうきょうはまだ４月だったので、きおんが１４どぐらいでした。（ウ）、わたしはおしいれのおくから、夏の洋服を出して、かばんにいっぱい入れて出かけることにしました。２はく３日の旅行ですが、一日中、おきなわの町をけんぶつしたり、海で泳いだりするので、ようふくはたくさんあったほうがいいと思ったのです。",
            "Q3 （イ）には何を入れますか。",
            "だけど",
            "すると",
            "だから",
            "それから",
            3
        )

        sentenceList.add(sentence3)

        val sentence4 = reading(
            4,
            "先月わたしは学校の友達といっしょに、おきなわへ旅行に行きました。わたしたちは、旅行の前に、おきなわから来た日本人の友達にいろいろ（ア）。友達は、「おきなわはとうきょうよりずっと南だから、とても暑いよ。（イ）、夏の服をたくさん持っていったほうがいい」と言いました。そのころとうきょうはまだ４月だったので、きおんが１４どぐらいでした。（ウ）、わたしはおしいれのおくから、夏の洋服を出して、かばんにいっぱい入れて出かけることにしました。２はく３日の旅行ですが、一日中、おきなわの町をけんぶつしたり、海で泳いだりするので、ようふくはたくさんあったほうがいいと思ったのです。",
            "Q4 （ウ）には何を入れますか。",
            "そうすると",
            "ところが",
            "それに",
            "それで",
            4
        )

        sentenceList.add(sentence4)

        val sentence5 = reading(
            5,
            "Ａ「きのうかさを買いました。」\n" +
                    "Ｂ「あ、そのかさですか。きれいなかさですね。高かったですか。」\n" +
                    "Ａ「いいえ。きょねん買ったのは高くておもかったですが、このかさはかるくていいです。」\n" +
                    "\n",
            "Q5 きのう買ったかさはどんなかさですか。",
            "高くておもいです。",
            "安いですが、おもいです。",
            "かるくてきれいです。",
            "きれいですが、高いです。",
            1
        )

        sentenceList.add(sentence5)

        val sentence6 = reading(
            6,
            "わたしたちはまいあさうたのれんしゅうをします。けさのれんしゅうは９時２０分から１時間でした。山川さんと大山さんは来ませんでした。高木さんは３０分おそく来ました。",
            "Q6 ただしいものはどれですか。",
            "れんしゅうは９時２０分から１時までです。",
            "高木さんは１時間れんしゅうしました。",
            "れんしゅうを休んだ人は３人です。",
            "高木さんは９時５０分にれんしゅうに来ました。",
            2
        )

        sentenceList.add(sentence6)

        val sentence7 = reading(
            7,
            "パク: すみません、あの上にある本を見たいです。（ ア ）。\n" +
                    "店の人: はい、わかりました。（ イ ）。\n" +
                    "パク: あれです。あの『にほんご』と書いてある本です。\n" +
                    "店の人: これですか。\n" +
                    "パク　: いいえ、かんじじゃなくてひらがなで『にほんご』と書いてある本です。\n" +
                    "店の人: ああ、これですか。\n" +
                    "パク: はい、それです。それはいくらですか。\n" +
                    "店の人: ３０００円です。\n" +
                    "パク: ３０００円ですか。ちょっと高いですね。（ウ）すみません。\n" +
                    "店の人: いいえ。またどうぞ。",
            "Q7 （ア）にはなにがはいりますか？",
            "とってくださいませんか",
            "とっていますか",
            "とりましょうか",
            "とりますか",
            1
        )

        sentenceList.add(sentence7)

        val sentence8 = reading(
            8,
            "パク: すみません、あの上にある本を見たいです。（ ア ）。\n" +
                    "店の人: はい、わかりました。（ イ ）。\n" +
                    "パク: あれです。あの『にほんご』と書いてある本です。\n" +
                    "店の人: これですか。\n" +
                    "パク　: いいえ、かんじじゃなくてひらがなで『にほんご』と書いてある本です。\n" +
                    "店の人: ああ、これですか。\n" +
                    "パク: はい、それです。それはいくらですか。\n" +
                    "店の人: ３０００円です。\n" +
                    "パク: ３０００円ですか。ちょっと高いですね。（ウ）すみません。\n" +
                    "店の人: いいえ。またどうぞ。",
            "Q8（イ）にはなにがはいりますか？",
            "どれが本ですか。",
            "このほんはありませんか？",
            "これはほんですか？",
            "どの本ですか",
            4
        )

        sentenceList.add(sentence8)

        val sentence9 =
            reading(9, "リン「むらたさん、ちょっといいですか。」\n" +
                    "むらた「はい、なんですか。」\n" +
                    "リン「明日病院へ行きますから、じゅぎょうに出ません。明日の夜電話しますから、宿題をおしえてください。」\n" +
                    "むらた「はい、わかりました。」\n" +
                    "\n", "ただしいものはどれですか。", "りんさんはむらたさんに電話します。", "むらたさんはあしたびょういんへ行きます。", "りんさんはきょうじゅぎょうを休みます。", "むらたさんはきょうしゅくだいをおしえます。", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(
            10,
            "新しいパン屋です！\n" +
                    "私たちがまいあさこの店でパンを作ります。野菜は入っているパンもあります。ほかに、甘いパンもあります。\n" +
                    "１０月３日の月曜日からです。\n" +
                    "１０月５日まで甘いパンを安く売ります。\n" +
                    "皆さん、どうぞ来てください。\n" +
                    "\n",
            "ただしいものはどれですか。",
            "１０月３日からいろいろなパンを売ります。",
            "パンはまいばん店で作ります。",
            "１０月３日からいろいろなパンを売ります。",
            "野菜が入っているパンは甘いです。",
            1
        )

        sentenceList.add(sentence10)


        return sentenceList
    }
}




