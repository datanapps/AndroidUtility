package datanapps.androidutility.utils.kotlin


import datanapps.androidutility.BuildConfig


/*
*
* Yogendra
* 11/01/2019
*
*
*  The purpose of this class to print log
*
* */
object DNALog {
/*
     * This included because, sonar raise create bug each class should have constructor
     * */



        private val TAG = "datanapps"

        /*
    * Debug
    * */
        fun d(msg: String) {
            if (BuildConfig.DEBUG) {
                android.util.Log.d(TAG, validateString(msg))
            }
        }

        /*
     * ERROR
     * */
        fun e(msg: String) {
            if (BuildConfig.DEBUG) {
                android.util.Log.e(TAG, validateString(msg))
            }
        }

        /*
     * INFO
     * */
        fun i(msg: String) {
            if (BuildConfig.DEBUG) {
                android.util.Log.i(TAG, validateString(msg))
            }
        }

        /*
* VERBOSE
* */
        fun v(msg: String) {
            if (BuildConfig.DEBUG) {
                android.util.Log.v(TAG, validateString(msg))
            }
        }


        private fun validateString(msg: String?): String {
            return msg ?: "null"
        }


}
