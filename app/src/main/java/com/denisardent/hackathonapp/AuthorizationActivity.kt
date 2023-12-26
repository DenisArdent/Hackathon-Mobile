package com.denisardent.hackathonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.denisardent.hackathonapp.databinding.ActivityAuthorizationBinding
import com.denisardent.hackathonapp.databinding.MainLayoutBinding
import com.denisardent.hackathonapp.presentation.authorization.SignInScreen
import com.denisardent.hackathonapp.presentation.authorization.SignInViewModel

class AuthorizationActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    val viewModel by viewModels<SignInViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        Repositories.init(applicationContext)
        super.onCreate(savedInstanceState)
        setContent { SignInScreen(viewModel) }
    }
}