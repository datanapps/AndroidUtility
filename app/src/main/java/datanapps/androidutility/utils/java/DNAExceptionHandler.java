package datanapps.androidutility.utils.java;


import android.util.Log;

/*

 /*
 *  Yogendra
 *
 * https://github.com/datanapps
 *
 * 10-01-2019
 * This class is responsible to manage exception logs and error of application
 * */
public class DNAExceptionHandler {

    DNAExceptionHandler() {
        // nothing to do here
    }

    /**
     * Handle Exception in log and can send to crashlytics
     *
     * @Param e exception of app
     */
    public static void handleException(Exception e) {
        if (e != null) {
            Log.e("DNA", e.getMessage());
            //Crashlytics.logException(e);
        }
    }

    /**
     * Handle Exception in log and can send to crashlytics
     *
     * @Param e exception of app
     */
    public static void handleException(Error e) {
        if (e != null) {
            Log.e("DNA", e.getMessage());
           // Crashlytics.logException(e);
        }
    }

    /**
     * Handle Exception in log and can send to crashlytics
     *
     * @Param errorValue String of app
     */
    public static void handleException(String errorValue) {
        if (errorValue != null) {
            Log.e("DNA", errorValue);
            //Crashlytics.logException(e);
        }
    }
}
