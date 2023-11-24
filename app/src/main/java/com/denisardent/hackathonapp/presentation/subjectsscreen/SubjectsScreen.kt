package com.denisardent.hackathonapp.presentation.subjectsscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.denisardent.hackathonapp.R
import com.denisardent.hackathonapp.data.Subject

@Composable
fun SubjectsScreen(viewModel: SubjectsViewModel){
    val subjects = viewModel.subjects.collectAsStateWithLifecycle()
    LazyColumn( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)){
        items(subjects.value.subjectsList){ subject: Subject ->
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = "image description",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.clip(shape = RoundedCornerShape(10.dp))
                    .width(295.dp)
                    .height(180.dp)
            )
        }
    }
}