package datanapps.androidutility.utils.kotlin


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */
object DNACollectionUtils {

    fun isNotEmpty(collection: Collection<*>): Boolean {
        return !isEmpty(collection)
    }

    fun isEmpty(collection: Collection<*>?): Boolean {
        return collection == null || collection.isEmpty()
    }


}
