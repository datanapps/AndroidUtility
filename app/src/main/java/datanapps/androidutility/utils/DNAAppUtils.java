package datanapps.androidutility.utils;

import android.content.Context;
import android.widget.Toast;

import datanapps.androidutility.BuildConfig;



/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */


public class DNAAppUtils {


    /*
     * This included because, sonar raise create bug each class should have constructor
     * */

    DNAAppUtils() {
        // nothing to do here
    }

    /*
    * Application Version name
    * */
    public static String getAppVersionName() {
        return BuildConfig.VERSION_NAME;
    }

    /*
     * Application Version Code
     * */
    public static int getAppVersionCode() {
        return BuildConfig.VERSION_CODE;
    }



    /*
    *
    * Application package name and id both are same
    * */
    public static String getApplicationId() {
        return BuildConfig.APPLICATION_ID;
    }


    /*
     *
     * Application package name
     * */
    public static String getApplicationPackageName() {
        return getApplicationId();
    }



    /*
     *
     * Application build type
     * */
    public static String getBuildType() {
        return BuildConfig.BUILD_TYPE;
    }


    /*
     *
     * Application build type
     * */
    public static boolean isBuildType() {
        return BuildConfig.DEBUG;
    }

}
