package datanapps.androidutility.utils.kotlin

import android.app.Activity
import android.content.Context
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast


/*
 * To implement this file make sure in application gradle file you added google design dependency
 *   implementation "com.android.support:design:28.0.0"
 * */

/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */


class DNASnackBar {

    companion object {

        fun show(activity: Activity?, msg: String) {

            if (activity != null) {
                Snackbar
                        .make(activity.window.decorView.findViewById(android.R.id.content), validateString(msg), Snackbar.LENGTH_LONG).show()

            }
        }
        /*
        * if you are passing context from some where then it will be show toast because snackbar can show only for activities and view
        * */
        fun show(activity: Context?, msg: String) {

            if (activity != null) {
                if (activity is Activity) {
                    show(activity, msg)
                } else {
                    Toast.makeText(activity, validateString(msg), Toast.LENGTH_LONG).show()
                }
            }
        }


        fun show(activity: Activity?, msg: String, actionText: String, clickListener: View.OnClickListener) {
            if (activity != null) {
                Snackbar
                        .make(activity.window.decorView.findViewById(android.R.id.content), validateString(msg), Snackbar.LENGTH_LONG)
                        .setAction(actionText, clickListener).show()
            }

        }


        private fun validateString(msg: String?): String {
            return msg ?: "null"
        }
    }

}
