package datanapps.androidutility.utils.java;


import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;

import java.util.Calendar;
import java.util.Date;


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

    /**
     * Format                         time
     * <p>
     * "yyyy.MM.dd G 'at' HH:mm:ss z"	   2001.07.04 AD at 12:08:56 PDT
     * <p>
     * "EEE, MMM d, ''yy"	    Wed, Jul 4, '01
     * <p>
     * "h:mm a"	  12:08 PM
     * <p>
     * "hh 'o''clock' a, zzzz"	12 o'clock PM,                  Pacific Daylight Time
     * <p>
     * "K:mm a, z"	   0:08 PM, PDT
     * <p>
     * "yyyyy.MMMMM.dd GGG hh:mm aaa"	  02001.July.04 AD 12:08 PM
     * <p>
     * "EEE, d MMM yyyy HH:mm:ss Z"	   Wed, 4 Jul 2001 12:08:56 -0700
     * <p>
     * "yyMMddHHmmssZ"     010704120856-0700
     * <p>
     * "yyyy-MM-dd'T'HH:mm:ss.SSSZ"	2001-07-04T12:08:56.235-0700
     * <p>
     * "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"	2001-07-04T12:08:56.235-07:00
     * <p>
     * "YYYY-'W'ww-u"	2001-W27-3
     */


    // time

    public static final String DATE_FORMAT_HH_mm = "HH:mm"; // 23:30

    public static final String DATE_FORMAT_hh_mm = "hh:mm"; // 12:30

    public static final String DATE_FORMAT_hh_mm_ss = "hh:mm:ss"; // 12:30:30

    public static final String DATE_FORMAT_hh_mm_ss_aa = "hh:mm:ss aa"; // 12:30:30 am

    public static final String DATE_FORMAT_hh_mm_aa = "hh:mm aa"; // 12:30 am


    // date

    public static final String DATE_FORMAT_yyyy_dd_MM = "yyyy, dd MMM"; // 1989, 3 jun

    public static final String DATE_FORMAT_yyyy_MM_dd = "yyyy-MM-dd"; // 19891231

    public static final String DATE_FORMAT_yyyyMMdd = "yyyyMMdd"; // 19891231

    public static final String DATE_FORMAT_ddMMyyyy = "ddMMyyyy"; // 31121989

    public static final String DATE_FORMAT_dd_MM_yyyy = "dd-MM-yyyy"; // 31121989


    // date time
    public static final String DATE_FORMAT_dd_MM_yyyy_hh_mm_ss = "dd-MM-yyyy hh:mm:ss"; // 31-12-1989 12:30:30
    public static final String DATE_FORMAT_dd_MM_yyyy_hh_mm = "dd-MM-yyyy hh:mm"; // 31-12-1989 12:30
    public static final String DATE_FORMAT_dd_MM_yyyy_hh_mm_aa = "dd-MM-yyyy hh:mm aa"; // 31-12-1989 12:30 am

    public static final String DATE_FORMAT_MMM_dd_yyyy_hh_aa = "MMM dd, yyyy hh aa"; // Jan 15, 2019 12 pm


    public static String getCurrentDate(String format) {

        if (TextUtils.isEmpty(format)) {
            format = DATE_FORMAT_dd_MM_yyyy_hh_mm;
        }
        return DateFormat.format(format, new java.util.Date()).toString();
    }

    public static String formatDate(String format, long timeStamp) {
        if (timeStamp <= 0) {
            timeStamp = System.currentTimeMillis();
        }

        return DateFormat.format(format, new java.util.Date(timeStamp)).toString();
    }


    public static String formatDate(String format, Date date) {
        return DateFormat.format(format, date == null ? new Date() : date).toString();
    }

    public static String formatDate(String format, Calendar calendar) {
        return DateFormat.format(format, calendar == null ? Calendar.getInstance().getTime() : calendar.getTime()).toString();
    }


    /*
    *
    * It's return date  before one week timestamp
    *
    *  like return
    *
    *  1 day ago
    *  2 days ago
    *  5 days ago
    *  21 April 2019
    *
    *
    * */
    public static String getTimeAgoDate(long pastTimeStamp) {

        // for 2 min ago   use  DateUtils.MINUTE_IN_MILLIS
        // for 2 sec ago   use  DateUtils.SECOND_IN_MILLIS
        // for 1 hours ago use  DateUtils.HOUR_IN_MILLIS

        long now = System.currentTimeMillis();

        if (now - pastTimeStamp < 1000) {
            pastTimeStamp = pastTimeStamp + 1000;
        }
        CharSequence ago =
                DateUtils.getRelativeTimeSpanString(pastTimeStamp, now, DateUtils.SECOND_IN_MILLIS);
        return ago.toString();
    }


    /*
     *
     * It's return date  before one week timestamp
     *
     *  like return
     *
     *  1 day ago
     *  2 days ago
     *  5 days ago
     *  2 weeks ago
     *  2 months ago
     *  2 years ago
     *
     *
     * */

    public static String getTimeAgo(long mReferenceTime) {

        long now = System.currentTimeMillis();
        final long diff = now - mReferenceTime;
        if (diff < android.text.format.DateUtils.WEEK_IN_MILLIS) {
            return (diff <= 1000) ?
                    "just now" :
                    android.text.format.DateUtils.getRelativeTimeSpanString(mReferenceTime, now, DateUtils.MINUTE_IN_MILLIS,
                            DateUtils.FORMAT_ABBREV_RELATIVE).toString();
        } else if (diff <= 4 * android.text.format.DateUtils.WEEK_IN_MILLIS) {
            int week = (int)(diff / (android.text.format.DateUtils.WEEK_IN_MILLIS));
            return  week>1?week+" weeks Ago":week+" week Ago";
        } else if (diff < android.text.format.DateUtils.YEAR_IN_MILLIS) {
            int month = (int)(diff / (4 * android.text.format.DateUtils.WEEK_IN_MILLIS));
            return  month>1?month+" months Ago":month+" month Ago";
        } else {
            int year = (int) (diff/DateUtils.YEAR_IN_MILLIS);
            return year>1?year+" years Ago":year+" year Ago";
        }
    }

}
