package com.example.todolist.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity(tableName = "tast_event_table")
data class Task(
    @PrimaryKey(autoGenerate = true)
    var taskId: Long=0L,
    @ColumnInfo(name = "eventDate")
    var taskdate: Date = Date(),
    @ColumnInfo(name = "eventname")
    var taskname: String = "",
)