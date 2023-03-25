package com.pereyrarg11.codelabstate

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTaskList(
            list = wellnessViewModel.taskList,
            onCloseTask = { task ->
                wellnessViewModel.remove(task)
            }
        ) { task: WellnessTask, checked: Boolean ->
            wellnessViewModel.changeTaskChecked(task, checked)
        }
    }
}