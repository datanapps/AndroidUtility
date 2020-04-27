package datanapps.androidutility.utils.kotlin

import datanapps.androidutility.BuildConfig


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */


object DNAAppUtils {
/*
     * This included because, sonar raise create bug each class should have constructor
     * */



        /*
    * Application Version name
    * */
        val appVersionName: String
            get() = BuildConfig.VERSION_NAME

        /*
     * Application Version Code
     * */
        val appVersionCode: Int
            get() = BuildConfig.VERSION_CODE


        /*
    *
    * Application package name and id both are same
    * */
        val applicationId: String
            get() = BuildConfig.APPLICATION_ID


        /*
     *
     * Application package name
     * */
        val applicationPackageName: String
            get() = applicationId


        /*
     *
     * Application build type
     * */
        val buildType: String
            get() = BuildConfig.BUILD_TYPE


        /*
     *
     * Application build type
     * */
        val isDebug: Boolean
            get() = BuildConfig.DEBUG


}
