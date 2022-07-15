package com.example.todolist.Database

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface TaskDatabaseDao{
    @Insert
    fun insert(event1: Task)
}