package com.example.roomcodelab.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomcodelab.room.entity.User
import com.example.roomcodelab.util.C_NAME
import com.example.roomcodelab.util.TABLE_USERS

@Dao
interface UserDao {

    @Query("SELECT * FROM $TABLE_USERS ORDER BY $C_NAME ASC")
    fun queryAllSortByName(): LiveData<List<User>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: User)

    @Query("DELETE FROM $TABLE_USERS")
    suspend fun deleteAll()
}