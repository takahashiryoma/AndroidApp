package com.join.cbbaapp

data class reading (
    val id: Int,
    val QuestionSentence: String,
    val Question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
        )