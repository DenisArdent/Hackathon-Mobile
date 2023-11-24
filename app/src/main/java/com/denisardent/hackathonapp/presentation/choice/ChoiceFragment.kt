package com.denisardent.hackathonapp.presentation.choice

import android.os.Bundle
import android.view.View
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.denisardent.hackathonapp.R
import com.denisardent.hackathonapp.databinding.ChoiceLayoutBinding
import com.denisardent.hackathonapp.databinding.ProfileLayoutBinding
import com.denisardent.hackathonapp.presentation.profile.ProfileScreen
import com.denisardent.hackathonapp.presentation.profile.ProfileViewModel
import com.denisardent.hackathonapp.presentation.viewBinding
import com.denisardent.hackathonapp.ui.theme.HackathonAppTheme
import com.denisardent.hackathonapp.ui.theme.PrimaryBlack

class ChoiceFragment: Fragment(R.layout.choice_layout) {
    private val binding by viewBinding<ChoiceLayoutBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.setContent{
            HackathonAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = PrimaryBlack
                ) {
                    ChoiceScreen()
                }
            }
        }
    }
}