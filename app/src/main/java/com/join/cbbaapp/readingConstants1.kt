package com.join.cbbaapp

object readingConstants1 {

    const val TOTLE_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getWord(): ArrayList<reading> {
        val sentenceList = ArrayList<reading>()


        val sentence1 = reading(1, "わたしはあした、にほんごをべんきょうします。ともだちはえいごをべんきょうします。", "Q1 ともだちはなにをべんきょうしますか？", "えいご", "にほんご", "なに", "ひらがな", 1)

        sentenceList.add(sentence1)

        val sentence2 = reading(2, "いまは8じです。1じかんごにごはんをたべます。", "Q2 なんじにごはんをたべますか？", "1じ", "10じ", "7じ", "9じ", 4)

        sentenceList.add(sentence2)

        val sentence3 = reading(3, "あしたはかようびです。あさってはすいようびです。", "Q3 きょうはなんようびですか？", "どようび", "にちようび", "げつようび", "もくようび", 3)

        sentenceList.add(sentence3)

        val sentence4 = reading(4, "きょうはにちようびです。きのうはどようびでした。", "Q4 あさってはなんようびですか？", "もくようび", "すいようび", "げつようび", "かようび", 4)

        sentenceList.add(sentence4)

        val sentence5 = reading(5, "あと1じかんで8じですね。にほんごをべんきょうしないとっ！", "Q5 にほんごをなんじにべんきょうしますか？", "9じ", "5じ", "8じ", "7じ" , 1)

        sentenceList.add(sentence5)

        val sentence6 = reading(6, "きのうかさをかいました。すこしたかかったですが、いいかさです。", "Q6 どんなかさをかいましたか？", "たかくないけどいいかさ", "たかいけどいいかさ" , "たかいけどわるいかさ", "ただのかさ", 2)

        sentenceList.add(sentence6)

        val sentence7 = reading(7, "A:すみません。あのうえにあるペンをみたいです。（ア）。B: わかりました。", "Q7 （ア）にはなにがはいりますか？", "とってくれませんか？", "とりましょうか？", "とってますか？", "とります。", 1)

        sentenceList.add(sentence7)

        val sentence8 = reading(8, "A: あのほんをとってくれませんか？ B: わかりました。（ア）", "Q8（ア）にはなにがはいりますか？", "これはほんです。", "このほんはありませんか？", "これはほんですか？", "どのほんですか？", 4)

        sentenceList.add(sentence8)

        val sentence9 = reading(9, "わたしは1じにおきて、2じかんごにまたねました。", "Q9 わたしはなんじにまたねましたか？", "3じ", "2じ", "4じ", "5じ", 1)

        sentenceList.add(sentence9)

        val sentence10 = reading(10, "きのうさかなをたべました。きょうはにくをたべました。きょうは4/5です。", "Q10 4/4はなにをたべましたか？", "さかな", "にく", "ベーコン", "ざかな" , 1)

        sentenceList.add(sentence10)


        return sentenceList
    }


}