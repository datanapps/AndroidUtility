package datanapps.androidutility.utils.java;

import android.content.Context;
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
private static Toast toast;
    DNAToast() {
        // nothing to do here
    }

    public static void show(Context context, String msg) {

        if (context != null) {
            if (toast!= null) {
                toast.cancel();
            }
            toast= Toast.makeText(context, validateString(msg), getToastTime());
            toast.show();
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
