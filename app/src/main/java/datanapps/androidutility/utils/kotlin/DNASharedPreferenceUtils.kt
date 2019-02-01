package datanapps.androidutility.utils.kotlin

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor

/**
 * This class is used to save and retrieve data from shared preferences.
 */
object DNASharedPreferenceUtils {
    private var shared: SharedPreferences? = null
    private var edit: Editor? = null
    private val SHARED_PREFERENCE_NAME = "dna_shar_pref_name"

    fun init(c: Context) {
        init(c, SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE)
    }

    fun init(context: Context, preferenceName: String, mode: Int) {
        shared = context.getSharedPreferences(preferenceName,
                mode)
        edit = shared!!.edit()
        edit!!.apply()
    }
    //==================================================================//

    /**
     * Save  string imageId in shared pref
     */
    fun saveString(key: String, value: String) {
        edit!!.putString(key, value)
        edit!!.apply()
    }


    /**
     * get Saved String value from shared preference
     *
     * @return String
     */
    fun getString(key: String?): String? {
        return if (key != null) {
            shared!!.getString(key, "")
        } else ""
    }


    /**
     * get Saved String value from shared preference
     *
     * @return String
     */
    fun getString(key: String?, defaultDesireValue: String): String? {
        return if (key != null) {
            shared!!.getString(key, defaultDesireValue)
        } else defaultDesireValue
    }
    //==================================================================//

    /**
     * Save int imageId in shared pref
     */
    fun saveInt(key: String, value: Int) {
        edit!!.putInt(key, value)
        edit!!.apply()
    }

    /**
     * get Saved int value from shared preference
     */
    fun getInt(key: String): Int {
        return shared!!.getInt(key, 0)
    }


    /**
     * get Saved int value from shared preference
     *
     * @param defaultDesireValue int
     * @key String
     */
    fun getInt(key: String, defaultDesireValue: Int): Int {
        return shared!!.getInt(key, defaultDesireValue)
    }


    //==================================================================//

    /**
     * Save float imageId in shared pref
     */
    fun saveFloat(key: String, value: Float) {
        edit!!.putFloat(key, value)
        edit!!.apply()
    }

    /**
     * get Saved int value from shared preference
     */
    fun getFloat(key: String): Float {
        return shared!!.getFloat(key, 0f)
    }


    /**
     * get Saved int value from shared preference
     *
     * @param defaultDesireValue float
     * @key String
     */
    fun getFloat(key: String, defaultDesireValue: Float): Float {
        return shared!!.getFloat(key, defaultDesireValue)
    }

    //==================================================================//

    /**
     * Save Long  in shared pref
     */
    fun saveLong(key: String, value: Long) {
        edit!!.putLong(key, value)
        edit!!.apply()
    }

    /**
     * get Saved long value from shared preference
     */
    fun getLong(key: String): Long {
        return shared!!.getLong(key, 0L)
    }

    /**
     * get Saved long value from shared preference
     *
     * @param defaultDesireValue long
     * @key String
     */
    fun getLong(key: String, defaultDesireValue: Long): Long {
        return shared!!.getLong(key, defaultDesireValue)
    }

    //==================================================================//

    /**
     * Save  boolean imageId in shared pref
     */
    fun saveBoolean(key: String, value: Boolean) {
        edit!!.putBoolean(key, value)
        edit!!.apply()
    }

    /**
     * get Saved boolean value from shared preference
     */
    fun getBoolean(key: String): Boolean {
        return shared!!.getBoolean(key, false)
    }


    /**
     * get Saved boolean value from shared preference
     *
     * @param defaultDesireValue boolean
     * @key String
     */
    fun getBoolean(key: String, defaultDesireValue: Boolean): Boolean {
        return shared!!.getBoolean(key, defaultDesireValue)
    }


    //==================================================================//

    /**
     * this method check to have value or not in shared preference
     */
    fun isExist(key: String): Boolean {
        return shared!!.contains(key)
    }

    /**
     * this method check to remove value from sharedPreference
     */
    fun remove(key: String) {
        edit!!.remove(key)
        edit!!.apply()
    }

    fun clearAllSharedPreferences() {
        edit!!.clear()
        edit!!.apply()
    }

}
