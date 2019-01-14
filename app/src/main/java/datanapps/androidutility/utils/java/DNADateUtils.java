package datanapps.androidutility.utils.java;


import android.text.format.DateFormat;


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */
public class DNADateUtils {


    /*
     * This included because, sonar raise create bug each class should have constructor
     * */
    private DNADateUtils() {
        // nothing to do here
    }
    public static final String DATE_FORMAT_yyyyMMdd = "yyyyMMdd"; // 19891231

    public static final String DATE_FORMAT_ddMMyyyy = "ddMMyyyy"; // 31121989


    public static String getCurrentDate(String format) {
        return DateFormat.format(format, new java.util.Date()).toString();
    }
}
