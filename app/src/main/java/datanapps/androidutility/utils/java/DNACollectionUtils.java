package datanapps.androidutility.utils.java;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */
public final class DNACollectionUtils {

    /*
    * This included because, sonar raise create bug each class should have constructor
    * */
    private DNACollectionUtils() {
        // nothing to do here
    }

    /*
    * =================== COMMON ==========================
    * */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }


    public static boolean isNull(Collection<?> collection) {
        return collection == null;
    }


    public static int size(Collection<?> collection) {
        if (collection == null)
            return 0;

        return collection.isEmpty()?0:collection.size();
    }


    /*
     * =================== LIST ==========================
     * */

    public static List<?> emptyList() {
        return Collections.emptyList();
    }


    /*
     * =================== SET ==========================
     * */
    public static Set<?> emptySet() {
        return Collections.emptySet();
    }


    /*
     * =================== MAP ==========================
     * */
    public static Map<?, ?> emptyMap() {
        return Collections.emptyMap();
    }
}
