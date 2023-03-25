package com.pereyrarg11.codelabstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pereyrarg11.codelabstate.ui.theme.CodelabStateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodelabStateTheme {
                WellnessApp(Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
fun WellnessApp(modifier: Modifier = Modifier.fillMaxSize()) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        WellnessScreen()
    }
}