package datanapps.androidutility.utils;


import datanapps.androidutility.BuildConfig;

public class DNALog {

    private static String TAG = "datanapps";

    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.d(TAG, msg);
        }
    }


    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(TAG,  msg);
        }
    }


    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.i(TAG,  msg);
        }
    }


    public static void v(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.v(TAG,  msg);
        }
    }


}
