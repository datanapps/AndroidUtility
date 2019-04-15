package datanapps.androidutility.utils.java;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */

/**
 * This class is used to save and retrieve data from shared preferences.
 **/
public class DNASharedPreferenceUtils {
    private static SharedPreferences shared;
    private static Editor edit;
    private static String SHARED_PREFERENCE_NAME = "dna_shar_pref_name";

    public static void init(Context c) {
        init(c, SHARED_PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public static void init(Context context, String preferenceName, int mode) {
        shared = context.getSharedPreferences(preferenceName,
                mode);
        edit = shared.edit();
        edit.apply();
    }
//==================================================================//

    /**
     * Save  string imageId in shared pref
     */
    public static void saveString(String key, String value) {
        edit.putString(key, value);
        edit.apply();
    }


    /**
     * get Saved String value from shared preference
     *
     * @return String
     */
    public static String getString(String key) {
        if (key != null) {
            return shared.getString(key, "");
        }
        return "";
    }


    /**
     * get Saved String value from shared preference
     *
     * @return String
     */
    public static String getString(String key, String defaultDesireValue) {
        if (key != null) {
            return shared.getString(key, defaultDesireValue);
        }
        return defaultDesireValue;
    }
//==================================================================//

    /**
     * Save int imageId in shared pref
     */
    public static void saveInt(String key, int value) {
        edit.putInt(key, value);
        edit.apply();
    }

    /**
     * get Saved int value from shared preference
     */
    public static int getInt(String key) {
        return shared.getInt(key, 0);
    }


    /**
     * get Saved int value from shared preference
     *
     * @param defaultDesireValue int
     * @key String
     */
    public static int getInt(String key, int defaultDesireValue) {
        return shared.getInt(key, defaultDesireValue);
    }


//==================================================================//

    /**
     * Save float imageId in shared pref
     */
    public static void saveFloat(String key, float value) {
        edit.putFloat(key, value);
        edit.apply();
    }

    /**
     * get Saved int value from shared preference
     */
    public static float getFloat(String key) {
        return shared.getFloat(key, 0);
    }


    /**
     * get Saved int value from shared preference
     *
     * @param defaultDesireValue float
     * @key String
     */
    public static float getFloat(String key, float defaultDesireValue) {
        return shared.getFloat(key, defaultDesireValue);
    }

//==================================================================//

    /**
     * Save Long  in shared pref
     */
    public static void saveLong(String key, long value) {
        edit.putLong(key, value);
        edit.apply();
    }

    /**
     * get Saved long value from shared preference
     */
    public static long getLong(String key) {
        return shared.getLong(key, 0L);
    }

    /**
     * get Saved long value from shared preference
     *
     * @param defaultDesireValue long
     * @key String
     */
    public static long getLong(String key, long defaultDesireValue) {
        return shared.getLong(key, defaultDesireValue);
    }

//==================================================================//

    /**
     * Save  boolean imageId in shared pref
     */
    public static void saveBoolean(String key, boolean value) {
        edit.putBoolean(key, value);
        edit.apply();
    }

    /**
     * get Saved boolean value from shared preference
     */
    public static boolean getBoolean(String key) {
        return shared.getBoolean(key, false);
    }


    /**
     * get Saved boolean value from shared preference
     *
     * @param defaultDesireValue boolean
     * @key String
     */
    public static boolean getBoolean(String key, boolean defaultDesireValue) {
        return shared.getBoolean(key, defaultDesireValue);
    }


    //==================================================================//

    /**
     * this method check to have value or not in shared preference
     */
    public static boolean isExist(String key) {
        return shared.contains(key);
    }

    /**
     * this method check to remove value from sharedPreference
     */
    public static void remove(String key) {
        edit.remove(key);
        edit.apply();
    }

    public static void clearAllSharedPreferences() {
        edit.clear();
        edit.apply();
    }

}
