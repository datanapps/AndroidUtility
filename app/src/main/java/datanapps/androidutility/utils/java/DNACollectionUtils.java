package datanapps.androidutility.utils.java;

import java.util.Collection;



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

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }



}
