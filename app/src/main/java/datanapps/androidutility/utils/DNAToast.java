package datanapps.androidutility.utils;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;



/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */


public class DNAToast {


    /*
     * This included because, sonar raise create bug each class should have constructor
     * */

    DNAToast() {
        // nothing to do here
    }

    public static void show(Context context, String msg) {

        if (context != null) {
            Toast.makeText(context, validateString(msg), getToastTime()).show();
        }
    }


    private static String validateString(String msg) {
        if (msg == null) {
            return "null";
        }
        return msg;
    }


   private static int getToastTime(){
        return Toast.LENGTH_LONG;
    }

}
