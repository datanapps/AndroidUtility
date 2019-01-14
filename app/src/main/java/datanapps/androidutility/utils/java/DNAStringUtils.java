package datanapps.androidutility.utils.java;

import android.text.TextUtils;

public class DNAStringUtils {



    /**
     * A String for a space character.
     *
     */
    public static final String SPACE = " ";

    /**
     * The empty String {@code ""}.
     *
     */
    public static final String EMPTY = "";


    /**
     * A String for line feed LF ("\n").
     *
     */
    public static final String LF = "\n";

    /**
     * A String for carriage return CR ("\r").
     *
     */
    public static final String CR = "\r";


    /**
     * A String for carriage return CR + LF ("\r\n").
     *
     */
    public static final String CRLF = "\\r\\n";



    public static boolean isEmpty(String str) {
        return TextUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

}
