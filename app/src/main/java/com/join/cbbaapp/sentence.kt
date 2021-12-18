package com.join.cbbaapp

data class sentence(
    val id: Int,
    val Question: String,
    val QuestionSentence: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)