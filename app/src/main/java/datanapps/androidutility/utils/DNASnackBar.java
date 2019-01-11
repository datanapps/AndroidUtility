package datanapps.androidutility.utils;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.ViewGroup;
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

    public static void show(Activity activity, String msg) {

        if (activity != null) {
            Snackbar
                    .make(activity.getWindow().getDecorView().findViewById(android.R.id.content), validateString(msg), Snackbar.LENGTH_LONG).show();

        }
    }

    public static void show(Context activity, String msg) {

        if (activity != null) {
            if (activity instanceof Activity) {
                show(activity, msg);
            } else {
                Toast.makeText(activity, validateString(msg), Toast.LENGTH_LONG).show();
            }
        }
    }


    public static void show(Activity activity, String msg, String actionText, View.OnClickListener clickListener) {
        if (activity != null) {
            Snackbar
                    .make(activity.getWindow().getDecorView().findViewById(android.R.id.content), validateString(msg), Snackbar.LENGTH_LONG)
                    .setAction(actionText, clickListener).show();
        }

    }


    private static String validateString(String msg) {
        if (msg == null) {
            return "null";
        }
        return msg;
    }

}
