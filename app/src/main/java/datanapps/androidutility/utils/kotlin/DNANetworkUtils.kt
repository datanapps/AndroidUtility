package datanapps.androidutility.utils.kotlin

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo


/*
 *
 * Yogendra
 * 22/05/2019
 *
 * */


object DNANetworkUtils {
/*
     * This included because, sonar raise create bug each class should have constructor
     * */

    

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

        fun isInternetConnected(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            val activeNetwork = cm.activeNetworkInfo
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting
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

        fun isConnectedWIFI(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            val activeNetwork = cm.activeNetworkInfo
            return activeNetwork != null && activeNetwork.type == ConnectivityManager.TYPE_WIFI
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

        fun isConnectedMobile(context: Context): Boolean {
            val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

            val activeNetwork = cm.activeNetworkInfo
            return activeNetwork != null && activeNetwork.type == ConnectivityManager.TYPE_MOBILE
        }


}
