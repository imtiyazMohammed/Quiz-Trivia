package com.example.quiztrivia

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_canada_flag,
            "Australia",
            "Canada",
            "United States",
            "India",
            2
        )
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_france_flag,
            "France",
            "Canada",
            "Spain",
            "Argentina",
            1
        )
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_india_flag,
            "Pakistan",
            "Canada",
            "United Kingdom",
            "India",
            4
        )
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_japan_flag,
            "Japan",
            "Singapore",
            "China",
            "Indonesia",
            1
        )
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_singapore_flag,
            "Australia",
            "Singapore",
            "France",
            "Africa",
            2
        )
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_spain_flag,
            "Bangladesh",
            "Brazil",
            "United States",
            "Spain",
            4
        )
        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_uk_flag,
            "Australia",
            "Canada",
            "United Kingdom",
            "United States",
            3
        )
        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_usa_flag,
            "Australia",
            "Canada",
            "United States",
            "Britain",
            3
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)

        return questionsList
    }
}