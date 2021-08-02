package datanapps.androidutility.utils.extension

import android.text.TextUtils


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */



    /**
     * A String for a space character.
     *
     */
    val SPACE = " "

    /**
     * The empty String `""`.
     *
     */
    val EMPTY = ""


    /**
     * A String for line feed LF ("\n").
     *
     */
    val LF = "\n"

    /**
     * A String for carriage return CR ("\r").
     *
     */
    val CR = "\r"


    /**
     * A String for carriage return CR + LF ("\r\n").
     *
     */
    val CRLF = "\\r\\n"


    /**
     * A String for not Applicable
     *
     */
    val NA = "NA"

    fun isEmpty(str: String): Boolean {
        return TextUtils.isEmpty(str)
    }

    fun isNotEmpty(str: String): Boolean {
        return !TextUtils.isEmpty(str)
    }


    fun isNull(str: String?): Boolean {
        return str == null
    }


    fun length(str: String?): Int {
        if (str == null)
            return 0
        return if (str.isEmpty()) 0 else str.length

    }
}
