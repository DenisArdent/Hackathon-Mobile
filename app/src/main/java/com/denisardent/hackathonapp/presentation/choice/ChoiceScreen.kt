package com.denisardent.hackathonapp.presentation.choice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.denisardent.hackathonapp.ui.theme.monsteratFamily

@Preview
@Composable
fun ChoiceScreen() {
    Column {
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            fontSize = 30.sp,
            color = Color.White, text = "Варианты", fontFamily = monsteratFamily, fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .width(390.dp)
                .height(173.dp)
                .background(color = Color(0xFF171717), shape = RoundedCornerShape(size = 15.dp)),
            contentAlignment = Alignment.Center
        ){
            Text(color = Color.White, text = "2+2?",
                fontFamily = monsteratFamily, fontWeight = FontWeight.Bold,
                fontSize = 28.sp)
        }
        Spacer(modifier = Modifier.height(50.dp))
        ChoseText(text = "Выберите ответ:", paddingStart = 30.dp)
        Spacer(modifier = Modifier.height(10.dp))
        ChoseBox(text = "3")
        Spacer(modifier = Modifier.height(10.dp))
        ChoseBox(text = "4")
        Spacer(modifier = Modifier.height(10.dp))
        ChoseBox(text = "5")
    }
}

@Composable
fun ChoseText(
    modifier: Modifier = Modifier,
    text: String,
    paddingStart: Dp = 0.dp
){
    Text(
        color = Color.White, text = text, fontFamily = monsteratFamily, fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(start = paddingStart)
    )
}

@Composable
fun ColumnScope.ChoseBox(color: Color = Color.White, text: String){
    Box (
        Modifier
            .background(color, shape = RoundedCornerShape(size = 15.dp))
            .fillMaxWidth(0.9f)
            .height(75.dp)
            .align(alignment = Alignment.CenterHorizontally)){
        Text(
            fontSize = 30.sp,
            color = Color.Black, text = text, fontFamily = monsteratFamily, fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}