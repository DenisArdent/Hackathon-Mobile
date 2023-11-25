package com.denisardent.hackathonapp.presentation.authorization

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.denisardent.hackathonapp.ui.theme.Tiffany
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(viewModel: SignInViewModel){
    Box (modifier = Modifier.fillMaxSize()){
        Column(modifier = Modifier
            .fillMaxWidth(0.9f)
            .fillMaxHeight(0.7f)
            .align(Alignment.Center)
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 15.dp))
        ) {
            val composableScope = rememberCoroutineScope()
            val state = viewModel.state.collectAsStateWithLifecycle()
            var username by remember{ mutableStateOf("") }
            var password by remember{ mutableStateOf("") }
            Text(text = "Регистрация",
                fontSize = 25.sp,
                color = Color.Black,
                modifier = Modifier.padding(26.dp,14.dp))
            Spacer(modifier = Modifier.height(60.dp))
            TextField(modifier = Modifier.align(Alignment.CenterHorizontally), value = username, onValueChange = { it ->
                username = it
            })
            Spacer(modifier = Modifier.height(10.dp))
            TextField(modifier = Modifier.align(Alignment.CenterHorizontally), value = password, onValueChange = { it ->
                password = it
            })
            Spacer(modifier = Modifier.height(70.dp))
            Button(colors = ButtonDefaults.buttonColors(containerColor = Tiffany), modifier = Modifier.align(Alignment.CenterHorizontally), shape = RoundedCornerShape(5.dp), onClick = {
                composableScope.launch {
                    viewModel.registration(username, password)
                }
            }) {
                Text(text = "Войти")
            }
            Text(text = "Ошибка", color = Color.Red, modifier = Modifier.alpha(if (state.value.isError == true) 1f else 0f))
        }
    }
}