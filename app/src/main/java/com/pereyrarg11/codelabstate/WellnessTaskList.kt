package com.pereyrarg11.codelabstate

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
) {
    LazyColumn(modifier = modifier) {
        items(
            items = list,
            key = { task ->
                task.id
            }
        ) { taskItem ->
            WellnessTaskItem(
                taskName = taskItem.label,
                checked = taskItem.checked,
                onClose = { onCloseTask(taskItem) },
                onCheckedChange = { checked: Boolean -> onCheckedTask(taskItem, checked) },
            )
        }
    }
}