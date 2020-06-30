package com.example.roomcodelab.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.roomcodelab.util.C_AGE
import com.example.roomcodelab.util.C_NAME
import com.example.roomcodelab.util.TABLE_USERS

@Entity(tableName = TABLE_USERS)
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    @ColumnInfo(name = C_NAME) var name: String = "",
    @ColumnInfo(name = C_AGE) var age: Int = 0
)