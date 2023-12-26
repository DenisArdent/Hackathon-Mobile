package com.denisardent.hackathonapp.data.local.subjects

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Index
import androidx.room.Query


@Dao
interface SubjectsDao {

    @Query("SELECT * FROM subjects")
    fun getSubjects(): List<SubjectEntity>
}