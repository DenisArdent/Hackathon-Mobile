package com.denisardent.hackathonapp.presentation.authorization

import android.os.Bundle
import android.view.View
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.denisardent.hackathonapp.R
import com.denisardent.hackathonapp.databinding.FragmentSignInBinding
import com.denisardent.hackathonapp.databinding.ProfileLayoutBinding
import com.denisardent.hackathonapp.presentation.profile.ProfileScreen
import com.denisardent.hackathonapp.presentation.profile.ProfileViewModel
import com.denisardent.hackathonapp.presentation.viewBinding
import com.denisardent.hackathonapp.ui.theme.HackathonAppTheme
import com.denisardent.hackathonapp.ui.theme.PrimaryBlack

class SignInFragment: Fragment(R.layout.fragment_sign_in) {
    val viewModel by viewModels<SignInViewModel>()
    private val binding by viewBinding<FragmentSignInBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("HI")
        binding.root.setContent{
            SignInScreen(viewModel)

        }
    }
}

