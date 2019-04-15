package datanapps.androidutility.utils.java;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


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


public class DNASnackBar {


    /*
     * This included because, sonar raise create bug each class should have constructor
     * */

    DNASnackBar() {
        // nothing to do here
    }

    public static void show(Activity activity, String snackBarMsg) {

        if (activity != null) {
            Snackbar
                    .make(activity.getWindow().getDecorView().findViewById(android.R.id.content), validateString(snackBarMsg), Snackbar.LENGTH_LONG).show();

        }
    }


    /*
    * if you are passing context from some where then it will be show toast because snackbar can show only for activit
    * */
    public static void show(Context activity, String snackBarMsg) {

        if (activity != null) {
            if (activity instanceof Activity) {
                show((Activity) activity, snackBarMsg);
            } else {
                Toast.makeText(activity, validateString(snackBarMsg), Toast.LENGTH_LONG).show();
            }
        }
    }

    // for activity and action
    public static void show(Activity activity, String snackBarMsg, String actionText, View.OnClickListener clickListener) {
        if (activity != null) {
            Snackbar
                    .make(activity.getWindow().getDecorView().findViewById(android.R.id.content), validateString(snackBarMsg), Snackbar.LENGTH_LONG)
                    .setAction(actionText, clickListener).show();
        }

    }


    // for view and action
    public static void show(View view, String snackBarMsg, String actionText, View.OnClickListener clickListener) {
        if (view != null) {
            Snackbar
                    .make(view, validateString(snackBarMsg), Snackbar.LENGTH_LONG)
                    .setAction(actionText, clickListener).show();
        }

    }




    // for styling view and action color action
    public static void show(View view, int viewBgColor, int colorOfMessage, String snackBarMsg, boolean isCapsMesg, int messageSize, int actionTextColor, String actionText, View.OnClickListener clickListener) {
        if (view != null) {
            Snackbar snackbar = Snackbar.make(view, validateString(snackBarMsg), Snackbar.LENGTH_LONG);
            View snackbarView = snackbar.getView();


          /*  // styling for rest of text

            TextView textView = snackbarView.findViewById(android.support.design.R.id.snackbar_text);
            textView.setTextColor(colorOfMessage);
            textView.setAllCaps(isCapsMesg);
            textView.setTextSize(messageSize<10?20:messageSize);*/



            // styling for background of snackbar

            snackbarView.setBackgroundColor(viewBgColor);


            //styling for action of text
            snackbar.setActionTextColor(actionTextColor);
            snackbar.setAction(actionText, clickListener).show();

        }

    }









    private static String validateString(String msg) {
        if (msg == null) {
            return "null";
        }
        return msg;
    }

}
