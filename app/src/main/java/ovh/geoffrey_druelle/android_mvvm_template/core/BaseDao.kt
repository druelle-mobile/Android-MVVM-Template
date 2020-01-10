package ovh.geoffrey_druelle.android_mvvm_template.core

import androidx.room.*

@Dao
interface BaseDao<T> {
    @Delete
    fun delete(tObject: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(tObject: T): Long

    @Update
    fun update(tObject: T)
}