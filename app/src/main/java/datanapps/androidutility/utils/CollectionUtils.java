package datanapps.androidutility.utils;

import java.util.Collection;



/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */
public final class CollectionUtils {

    /*
    * This included because, sonar raise create bug each class should have constructor
    * */
    private CollectionUtils() {
        // nothing to do here
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }



}
