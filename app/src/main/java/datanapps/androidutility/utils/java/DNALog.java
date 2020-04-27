package datanapps.androidutility.utils.java;


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

    public static void d(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.d(tag, validateString(msg));
        }
    }

    public static void d(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.d(TAG, validateString(msg));
        }
    }

    public static void d(String msg, Throwable throwable) {
        if (BuildConfig.DEBUG) {
            android.util.Log.d(TAG,  validateString(msg), throwable);
        }
    }

    public static void d(String msg, Error error) {
        if (BuildConfig.DEBUG) {
            android.util.Log.d(TAG,  validateString(msg), error);
        }
    }

    /*
     * ERROR
     * */

    public static void e(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(tag, validateString(msg));
        }
    }

    public static void e(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(TAG,  validateString(msg));
        }
    }

    public static void e(String msg, Throwable throwable) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(TAG,  validateString(msg), throwable);
        }
    }

    public static void e(String msg, Error error) {
        if (BuildConfig.DEBUG) {
            android.util.Log.e(TAG,  validateString(msg), error);
        }
    }

    /*
     * INFO
     * */

    public static void i(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.i(tag, validateString(msg));
        }
    }
    public static void i(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.i(TAG,  validateString(msg));
        }
    }

    public static void i(String msg, Throwable throwable) {
        if (BuildConfig.DEBUG) {
            android.util.Log.i(TAG,  validateString(msg), throwable);
        }
    }


    public static void i(String msg, Error error) {
        if (BuildConfig.DEBUG) {
            android.util.Log.i(TAG,  validateString(msg), error);
        }
    }

/*
* VERBOSE
* */
public static void v(String tag, String msg) {
    if (BuildConfig.DEBUG) {
        android.util.Log.v(tag, validateString(msg));
    }
}
    public static void v(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.v(TAG,  validateString(msg));
        }
    }

    public static void v(String msg, Throwable throwable) {
        if (BuildConfig.DEBUG) {
            android.util.Log.v(TAG,  validateString(msg), throwable);
        }
    }

    public static void v(String msg, Error error) {
        if (BuildConfig.DEBUG) {
            android.util.Log.v(TAG,  validateString(msg), error);
        }
    }


    /*
     * WARNING
     * */

    public static void w(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.w(tag, validateString(msg));
        }
    }
    public static void w(String msg) {
        if (BuildConfig.DEBUG) {
            android.util.Log.w(TAG,  validateString(msg));
        }
    }

    public static void w(String msg, Throwable throwable) {
        if (BuildConfig.DEBUG) {
            android.util.Log.w(TAG,  validateString(msg), throwable);
        }
    }

    public static void w(String msg, Error error) {
        if (BuildConfig.DEBUG) {
            android.util.Log.w(TAG,  validateString(msg), error);
        }
    }


    private static String validateString(String msg){
      if(msg==null){
          return "null";
      }
     return msg;
    }



}
