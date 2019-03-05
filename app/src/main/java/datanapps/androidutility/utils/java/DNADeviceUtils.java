package datanapps.androidutility.utils.java;

import android.os.Build;




/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */

/*
* All device detail:
*
* */
public class DNADeviceUtils {


    /*
     * This included because, sonar raise create bug each class should have constructor
     * */

    DNADeviceUtils() {
        // nothing to do here
    }

    /*
    * device serial no
    * */
    public static String getSerial() {
        return Build.SERIAL;
    }


    /*
     * device model no
     * */
    public static String getModel() {
        return Build.MODEL;
    }


    /*
     * device device id
     * */
    public static String getDeviceId() {
        return Build.ID;
    }



    /*
     * device manufacturer
     * */
    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }


    /*
     * device manufacturer
     * */
    public static String getBrand() {
        return Build.BRAND;
    }


    /*
     * device type
     * */
    public static String getType() {
        return Build.TYPE;
    }


    /*
     * device User
     * */
    public static String getUser() {
        return Build.USER;
    }



    /*
     * device Version code base
     * */
    public static int getBaseVersionCode() {
        return Build.VERSION_CODES.BASE;
    }


    /*
     * device incremental code
     * */
    public static String getVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }



    /*
     * device version SDK code
     * */
    public static String getSDKVersion() {
        return Build.VERSION.SDK;
    }



    /*
     * device version device board
     * */
    public static String getBoard() {
        return Build.BOARD;
    }


    /*
     * device version device host
     * */
    public static String getDeviceHost() {
        return Build.HOST;
    }



    /*
     * device version device fingerprint
     * */
    public static String getDeviceFingerprint() {
        return Build.FINGERPRINT;
    }


    /*
     * device version device hoast
     * */
    public static String getVersionRelease() {
        return Build.VERSION.RELEASE;
    }


}
