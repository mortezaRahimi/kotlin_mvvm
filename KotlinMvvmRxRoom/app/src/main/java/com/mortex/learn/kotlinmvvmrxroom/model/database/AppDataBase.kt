package com.mortex.learn.kotlinmvvmrxroom.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mortex.learn.kotlinmvvmrxroom.model.Post
import com.mortex.learn.kotlinmvvmrxroom.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}