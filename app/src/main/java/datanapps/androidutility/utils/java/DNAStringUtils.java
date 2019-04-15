package datanapps.androidutility.utils.java;

import android.text.TextUtils;

public class DNAStringUtils {


    /**
     * A String for a space character.
     */
    public static final String SPACE = " ";

    /**
     * The empty String {@code ""}.
     */
    public static final String EMPTY = "";


    /**
     * A String for line feed LF ("\n").
     */
    public static final String LF = "\n";

    /**
     * A String for carriage return CR ("\r").
     */
    public static final String CR = "\r";


    /**
     * A String for carriage return CR + LF ("\r\n").
     */
    public static final String CRLF = "\\r\\n";


    /**
     * A String for not Applicable
     */
    public static final String NA = "NA";

    public static boolean isEmpty(String str) {
        return TextUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean isNull(String str) {
        return str == null;
    }


    public static int length(String str) {
        if (str == null)
            return 0;
        return str.isEmpty()?0:str.length();
    }


}
