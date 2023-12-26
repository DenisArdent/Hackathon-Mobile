package com.denisardent.hackathonapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.denisardent.hackathonapp.data.local.subjects.SubjectEntity
import com.denisardent.hackathonapp.data.local.subjects.SubjectsDao

@Database(
    entities = [SubjectEntity::class],
    version = 1
)

abstract class AppDatabase: RoomDatabase() {
    abstract fun getSubjectsDao(): SubjectsDao
}