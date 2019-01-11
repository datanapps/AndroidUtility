package datanapps.androidutility.utils;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.View;


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

       public static void show(Activity activity, String msg) {
        Snackbar
                .make(activity.getWindow().getDecorView().findViewById(android.R.id.content), msg, Snackbar.LENGTH_LONG).show();
    }


    public static void show(Activity activity, String msg, String actionText, View.OnClickListener clickListener) {

        Snackbar
                .make(activity.getWindow().getDecorView().findViewById(android.R.id.content), msg, Snackbar.LENGTH_LONG)
                .setAction(actionText, clickListener).show();

    }

}
