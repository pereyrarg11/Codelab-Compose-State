package com.pereyrarg11.codelabstate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pereyrarg11.codelabstate.ui.theme.CodelabStateTheme

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (count > 0) {
            Text(text = "You've had $count glasses")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { count++ },
            enabled = count < 10
        ) {
            Text(text = "Add one")
        }
    }
}

@Preview
@Composable
fun WaterCountPreview() {
    CodelabStateTheme {
        WaterCounter()
    }
}