package com.example.todolist.view.listener

import com.example.todolist.model.TaskItem

interface TaskItemClickListener {
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)

    fun deleteTaskItem(taskItem: TaskItem)
}