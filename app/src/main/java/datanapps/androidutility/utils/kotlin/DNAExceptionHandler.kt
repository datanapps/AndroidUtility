package datanapps.androidutility.utils.kotlin


import android.util.Log


/*
*  Yogendra
*
* https://github.com/datanapps
*
* 10-01-2019
* This class is responsible to manage exception logs and error of application
* */

class DNAExceptionHandler internal constructor() {
    companion object {

        /**
         * Handle Exception in log and can send to crashlytics
         *
         * @Param e exception of app
         */
        fun handleException(e: Exception?) {
            if (e != null) {
                Log.e("DNA", e.message)
//Crashlytics.logException(e);
            }
        }

        /**
         * Handle Exception in log and can send to crashlytics
         *
         * @Param e exception of app
         */
        fun handleException(e: Error?) {
            if (e != null) {
                Log.e("DNA", e.message)
//Crashlytics.logException(e);
            }
        }

        /**
         * Handle Exception in log and can send to crashlytics
         *
         * @Param e exception of app
         */
        fun handleException(errorValue: String?) {
            if (errorValue != null) {
                Log.e("DNA", errorValue)
//Crashlytics.logException(errorValue);
            }
        }
    }
}
