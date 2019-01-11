package datanapps.androidutility.utils;

import java.util.Collection;



/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */
public final class CollectionUtils {

    private CollectionUtils() {
        // protected constructor
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }



}
