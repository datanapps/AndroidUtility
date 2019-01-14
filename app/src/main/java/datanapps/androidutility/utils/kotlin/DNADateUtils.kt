package datanapps.androidutility.utils.kotlin


import android.text.TextUtils
import android.text.format.DateFormat
import android.text.format.DateUtils


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */
object DNADateUtils {
    /**
     * Format                         time
     *
     * "yyyy.MM.dd G 'at' HH:mm:ss z"	   2001.07.04 AD at 12:08:56 PDT
     *
     * "EEE, MMM d, ''yy"	    Wed, Jul 4, '01
     *
     * "h:mm a"	  12:08 PM
     *
     * "hh 'o''clock' a, zzzz"	12 o'clock PM,                  Pacific Daylight Time
     *
     * "K:mm a, z"	   0:08 PM, PDT
     *
     * "yyyyy.MMMMM.dd GGG hh:mm aaa"	  02001.July.04 AD 12:08 PM
     *
     * "EEE, d MMM yyyy HH:mm:ss Z"	   Wed, 4 Jul 2001 12:08:56 -0700
     *
     * "yyMMddHHmmssZ"     010704120856-0700
     *
     * "yyyy-MM-dd'T'HH:mm:ss.SSSZ"	2001-07-04T12:08:56.235-0700
     *
     * "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"	2001-07-04T12:08:56.235-07:00
     *
     * "YYYY-'W'ww-u"	2001-W27-3
     *
     *
     */


    // time

    val DATE_FORMAT_HH_mm = "HH:mm" // 23:30

    val DATE_FORMAT_hh_mm = "hh:mm" // 12:30

    val DATE_FORMAT_hh_mm_ss = "hh:mm:ss" // 12:30:30

    val DATE_FORMAT_hh_mm_ss_aa = "hh:mm:ss aa" // 12:30:30 am

    val DATE_FORMAT_hh_mm_aa = "hh:mm aa" // 12:30 am


    // date

    val DATE_FORMAT_yyyy_dd_MM = "yyyy, dd MMM" // 1989, 3 jun

    val DATE_FORMAT_yyyy_MM_dd = "yyyy-MM-dd" // 19891231

    val DATE_FORMAT_yyyyMMdd = "yyyyMMdd" // 19891231

    val DATE_FORMAT_ddMMyyyy = "ddMMyyyy" // 31121989

    val DATE_FORMAT_dd_MM_yyyy = "dd-MM-yyyy" // 31121989


    // date time
    val DATE_FORMAT_dd_MM_yyyy_hh_mm_ss = "dd-MM-yyyy hh:mm:ss" // 31-12-1989 12:30:30
    val DATE_FORMAT_dd_MM_yyyy_hh_mm = "dd-MM-yyyy hh:mm" // 31-12-1989 12:30
    val DATE_FORMAT_dd_MM_yyyy_hh_mm_aa = "dd-MM-yyyy hh:mm aa" // 31-12-1989 12:30 am


    fun getCurrentDate(format: String): String {
        var ff = format

        if (TextUtils.isEmpty(format)) {
            ff = DATE_FORMAT_dd_MM_yyyy_hh_mm
        }
        return DateFormat.format(ff, java.util.Date()).toString()
    }

    fun getDateWithTimeStamp(format: String, timeStamp: Long): String {
        var timeStampVal = timeStamp
        if (timeStamp <= 0) {
            timeStampVal = System.currentTimeMillis()
        }

        return DateFormat.format(format, java.util.Date(timeStampVal)).toString()
    }


    fun getAgoDateTime(pastTimeStamp: Long): String {
        var pastTS = pastTimeStamp

        // for 2 min ago   use  DateUtils.MINUTE_IN_MILLIS
        // for 2 sec ago   use  DateUtils.SECOND_IN_MILLIS
        // for 1 hours ago use  DateUtils.HOUR_IN_MILLIS

        val now = System.currentTimeMillis()

        if (now - pastTimeStamp < 1000) {
            pastTS = pastTimeStamp + 1000
        }


        val ago = DateUtils.getRelativeTimeSpanString(pastTS, now, DateUtils.SECOND_IN_MILLIS)


        return ago.toString()
    }
}/*
     * This included because, sonar raise create bug each class should have constructor
     * */// nothing to do here
