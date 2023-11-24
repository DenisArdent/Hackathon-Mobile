package com.denisardent.hackathonapp.presentation.subjectsscreen

import android.os.Bundle
import android.view.View
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.denisardent.hackathonapp.R
import com.denisardent.hackathonapp.databinding.SubjectLayoutBinding
import com.denisardent.hackathonapp.presentation.viewBinding
import com.denisardent.hackathonapp.ui.theme.HackathonAppTheme

class SubjectsFragment: Fragment(R.layout.subject_layout) {
    val viewModel by viewModels<SubjectsViewModel>()
    private val binding by viewBinding<SubjectLayoutBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.setContent{
            HackathonAppTheme {
                // A surface container using the 'background' color from the theme {
                SubjectsScreen(viewModel = viewModel)
            }
        }
    }
}