package com.denisardent.hackathonapp.presentation.subjectsscreen

import android.view.RoundedCorner
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.denisardent.hackathonapp.R
import com.denisardent.hackathonapp.data.Subject
import com.denisardent.hackathonapp.ui.theme.Typography

@Composable
fun SubjectsScreen(viewModel: SubjectsViewModel, navController: NavController){
    val subjects = viewModel.subjects.collectAsStateWithLifecycle()
    LazyColumn( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(30.dp)){
        items(subjects.value.subjectsList){ subject: Subject ->
            SubjectBox(subject.name, subject.progress, navController)
        }
        item {
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}

@Composable
fun SubjectBox(text: String, progress: Float, navController: NavController){
    Box(modifier = Modifier
        .clip(shape = RoundedCornerShape(10.dp))
        .height(180.dp)
        .clickable { navController.navigate(R.id.choiceFragment) }
        .fillMaxWidth(0.85f)){
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(10.dp))
                .fillMaxSize()
        )
        Text(color = Color.White, style = Typography.titleLarge,text = text,
            modifier = Modifier
                .align(Alignment.Center)
                .wrapContentHeight(align = Alignment.CenterVertically))
        LinearProgressIndicator( progress = progress, Modifier.height(38.dp)
            .fillMaxWidth(0.9f)
            .align(Alignment.BottomCenter)
            .padding(bottom = 29.dp), color = Color(0xFF24FF00)
        )
    }
}