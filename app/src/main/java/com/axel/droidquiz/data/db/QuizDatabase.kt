package com.axel.droidquiz.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.axel.droidquiz.data.model.Question
import com.axel.droidquiz.data.model.Answer

@Database(entities = [(Question::class), (Answer::class)], version = 1)
abstract class QuizDatabase : RoomDatabase() {
}