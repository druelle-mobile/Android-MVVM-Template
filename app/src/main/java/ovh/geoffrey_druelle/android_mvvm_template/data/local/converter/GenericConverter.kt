package ovh.geoffrey_druelle.android_mvvm_template.data.local.converter

import androidx.room.TypeConverter

// Example of BooleanConverter
class GenericConverter {

    @TypeConverter
    fun toIntFromBoolean(boolean: Boolean): Int {
        return if (boolean) 1
        else 0
    }

    @TypeConverter
    fun toBooleanFromInt(int: Int): Boolean {
        return int == 1
    }
}
