package datanapps.androidutility.utils.kotlin

import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


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


object DNASnackBar {



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

        // for activity and action
        fun show(activity: Activity?, msg: String, actionText: String, clickListener: View.OnClickListener) {
            if (activity != null) {
                Snackbar
                        .make(activity.window.decorView.findViewById(android.R.id.content), validateString(msg), Snackbar.LENGTH_LONG)
                        .setAction(actionText, clickListener).show()
            }

        }


        // for view and action
        fun show(view: View?, msg: String, actionText: String, clickListener: View.OnClickListener) {
            if (view != null) {
                Snackbar
                        .make(view, validateString(msg), Snackbar.LENGTH_LONG)
                        .setAction(actionText, clickListener).show()
            }

        }


        // for styling view and action color action
        fun show(view: View?, viewBgColor: Int, snackBarMsg: String, actionTextColor: Int, actionText: String, clickListener: View.OnClickListener) {
            if (view != null) {
                val snackbar = Snackbar.make(view, validateString(snackBarMsg), Snackbar.LENGTH_LONG)
                val snackbarView : View = snackbar.view
                 // styling for background of snackbar
                snackbarView.setBackgroundColor(viewBgColor)
                //styling for action of text
                snackbar.setActionTextColor(actionTextColor)
                snackbar.setAction(actionText, clickListener).show()

            }

        }

        private fun validateString(msg: String?): String {
            return msg ?: "null"
        }
    }



