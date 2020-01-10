package ovh.geoffrey_druelle.android_mvvm_template.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import io.reactivex.Single
import ovh.geoffrey_druelle.android_mvvm_template.core.BaseDao
import ovh.geoffrey_druelle.android_mvvm_template.data.local.model.GenericModel

@Dao
interface GenericDao : BaseDao<GenericModel> {

    @Query("SELECT * FROM Generic")
    fun getAll() : Single<List<GenericModel>>

    @Query("SELECT COUNT(*) FROM Generic")
    fun countEntries(): Int
}
