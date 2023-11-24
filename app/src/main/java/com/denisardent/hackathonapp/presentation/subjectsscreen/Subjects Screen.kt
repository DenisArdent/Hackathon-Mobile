package com.denisardent.hackathonapp.presentation.subjectsscreen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.denisardent.hackathonapp.data.Subject

@Composable
fun SubjectsScreen(viewModel: SubjectsViewModel){
    val subjects = viewModel.subjects.collectAsStateWithLifecycle()
    LazyVerticalGrid(columns = GridCells.Fixed(2), contentPadding = PaddingValues(5.dp)){
        items(subjects.value.subjectsList){ subject: Subject ->
            Column() {
                Text(text = subject.name)
                Spacer(modifier = Modifier.height(5.dp))
                LinearProgressIndicator(modifier = Modifier.fillMaxSize(), progress = subject.progress)
            }
        }
    }
}