package datanapps.androidutility.utils.java;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;



/*
 *
 * Yogendra
 * 22/05/2019
 *
 * */


public class DNANetworkUtils {


    /*
     * This included because, sonar raise create bug each class should have constructor
     * */

    DNANetworkUtils() {
        // nothing to do here
    }

    /*
     * This will check internet connection in android
     *
     *  Make sure you have mention below permission in manifest
     *
     *  <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
        <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
     *
     *
     * */

    public static boolean isInternetConnected(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
    }



     /*
     * This will check internet connection with wifi or others
     *
     *  Make sure you have mention below permission in manifest
     *
     *  <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
        <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
     *
     *
     * */

    public static boolean isConnectedWIFI(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI);
    }


     /*
     * This will check internet connection with mobile or others
     *
     *  Make sure you have mention below permission in manifest
     *
     *  <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
        <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
     *
     *
     * */

    public static boolean isConnectedMobile(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE);
    }


    /**
     * Returns true, if given {@link NetworkInfo} is available, online and not in roaming mode
     *
     * @param context Context
     * @return true or false
     */
    public static boolean isNoRoaming(Context context) {
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return networkInfo != null && !networkInfo.isRoaming();
    }

}
