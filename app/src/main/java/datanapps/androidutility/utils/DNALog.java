package datanapps.androidutility.utils;


import datanapps.androidutility.BuildConfig;


/*
*
* Yogendra
* 11/01/2019
*
* */
public class DNALog {

    private static String TAG = "datanapps";
    /*
     * This included because, sonar raise create bug each class should have constructor
     * */

    DNALog(){
        // nothing to do here
    }

    /*
    * Debug
    * */
    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.d(TAG, msg);
        }
    }

    /*
     * ERROR
     * */
    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(TAG,  msg);
        }
    }

    /*
     * INFO
     * */
    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.i(TAG,  msg);
        }
    }

/*
* VERBOSE
* */
    public static void v(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.v(TAG,  msg);
        }
    }


}
