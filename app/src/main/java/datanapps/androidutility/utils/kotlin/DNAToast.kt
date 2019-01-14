package datanapps.androidutility.utils.kotlin

import android.content.Context
import android.widget.Toast


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */


class DNAToast {
    /*
         * This included because, sonar raise create bug each class should have constructor
         * */
    companion object {

        fun show(context: Context?, msg: String) {

            if (context != null) {
                Toast.makeText(context, validateString(msg), toastTime).show()
            }
        }


        private fun validateString(msg: String?): String {
            return msg ?: "null"
        }


        private val toastTime: Int
            get() = Toast.LENGTH_LONG
    }

}
