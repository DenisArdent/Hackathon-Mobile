package com.denisardent.hackathonapp.data.local

import android.util.Log
import com.denisardent.hackathonapp.data.DataRepository
import com.denisardent.hackathonapp.data.Subject
import com.denisardent.hackathonapp.data.local.subjects.SubjectEntity
import com.denisardent.hackathonapp.data.local.subjects.SubjectsDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RoomDataRepository(private val subjectsDao: SubjectsDao): DataRepository {
    override suspend fun getSubjects(): List<Subject> = withContext(Dispatchers.IO){
        subjectsDao.getSubjects().map { subjectEntity ->
            Log.d("SUBJ", subjectEntity.toString())
            Subject(subjectEntity.name, subjectEntity.progress)
        }
    }
}