package datanapps.androidutility.utils.java;


import android.text.TextUtils;

import datanapps.androidutility.BuildConfig;


/*
*
* Yogendra
* 11/01/2019
*
* The purpose of this class to print log
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
            android.util.Log.d(TAG, validateString(msg));
        }
    }

    /*
     * ERROR
     * */
    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(TAG,  validateString(msg));
        }
    }

    /*
     * INFO
     * */
    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.i(TAG,  validateString(msg));
        }
    }

/*
* VERBOSE
* */
    public static void v(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.v(TAG,  validateString(msg));
        }
    }


    private static String validateString(String msg){
      if(msg==null){
          return "null";
      }
     return msg;
    }



}
