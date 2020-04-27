package datanapps.androidutility.utils.kotlin

import android.os.Build


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
class DNADeviceUtils
/*
     * This included because, sonar raise create bug each class should have constructor
     * */
internal constructor()// nothing to do here
{
    companion object {

        /*
    * device serial no
    * */
        val serial: String
            get() = Build.SERIAL


        /*
     * device model no
     * */
        val model: String
            get() = Build.MODEL


        /*
     * device device id
     * */
        val deviceId: String
            get() = Build.ID


        /*
     * device manufacturer
     * */
        val manufacturer: String
            get() = Build.MANUFACTURER


        /*
     * device manufacturer
     * */
        val brand: String
            get() = Build.BRAND


        /*
     * device type
     * */
        val type: String
            get() = Build.TYPE


        /*
     * device User
     * */
        val user: String
            get() = Build.USER


        /*
     * device Version code base
     * */
        val baseVersionCode: Int
            get() = Build.VERSION_CODES.BASE


        /*
     * device incremental code
     * */
        val versionIncremental: String
            get() = Build.VERSION.INCREMENTAL


        /*
     * device version SDK code
     * */
        val sdkVersion: Int
            get() = Build.VERSION.SDK_INT


        /*
     * device version device board
     * */
        val board: String
            get() = Build.BOARD


        /*
     * device version device host
     * */
        val deviceHost: String
            get() = Build.HOST


        /*
     * device version device fingerprint
     * */
        val deviceFingerprint: String
            get() = Build.FINGERPRINT


        /*
     * device version device hoast
     * */
        val versionRelease: String
            get() = Build.VERSION.RELEASE
    }


}
