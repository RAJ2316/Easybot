package com.example.easybot

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.easybot.ui.theme.EasybotTheme
import np.com.bimalkafle.easybot.ChatPage
import np.com.bimalkafle.easybot.ChatViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val ChatViewModel = androidx.lifecycle.ViewModelProvider(this)[ChatViewModel :: class.java]
        setContent {
            EasybotTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ChatPage(modifier = Modifier.padding(innerPadding), ChatViewModel())
                }
            }
        }
    }

}




