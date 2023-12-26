package com.denisardent.hackathonapp.data.local.subjects
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "subjects",
)
data class SubjectEntity(
    @PrimaryKey val name: String,
    val progress: Float,
)
