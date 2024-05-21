package com.axel.droidquiz

import android.app.Application
import androidx.room.Room
import com.axel.droidquiz.data.db.QuizDatabase

class QuizApplication : Application() {
    private val DB_NAME = "quiz_database"

    companion object{
        lateinit var database: QuizDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room
            .databaseBuilder(
                this,
                QuizDatabase::class.java,
                DB_NAME
            )
            .build()
    }

}