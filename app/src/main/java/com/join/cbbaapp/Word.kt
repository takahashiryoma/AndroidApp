package com.join.cbbaapp

data class Word(
    val id: Int,
    val Question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)

