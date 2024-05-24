package com.example.todolist.viewmodel

import android.app.Application
import com.example.todolist.repository.TaskItemDatabase
import com.example.todolist.repository.TaskItemRpository

class TodoApplication: Application() {

    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRpository(database.taskItemDao()) }
}