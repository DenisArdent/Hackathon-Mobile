package com.denisardent.hackathonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.denisardent.hackathonapp.presentation.subjectsscreen.SubjectsScreen
import com.denisardent.hackathonapp.presentation.subjectsscreen.SubjectsViewModel
import com.denisardent.hackathonapp.ui.theme.HackathonAppTheme
import androidx.navigation.NavGraph
import androidx.navigation.ui.NavigationUI
import com.denisardent.hackathonapp.databinding.MainLayoutBinding

class MainActivity : AppCompatActivity() {

    val viewModel by viewModels<SubjectsViewModel>()
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = MainLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNav, navController)
    }
}