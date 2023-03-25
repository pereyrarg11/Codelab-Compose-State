package com.pereyrarg11.codelabstate

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {

    private val _taskList = getWellnessTasks().toMutableStateList()
    val taskList: List<WellnessTask>
        get() = _taskList

    fun remove(item: WellnessTask) {
        _taskList.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) {
        taskList.find {
            it.id == item.id
        }?.let { task ->
            task.checked = checked
        }
    }

    private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task #$i") }
}