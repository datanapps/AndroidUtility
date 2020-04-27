package datanapps.androidutility.utils.kotlin


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */
object DNACollectionUtils {

    /*
   * =================== COMMON ==========================
   * */

    fun isNotEmpty(collection: Collection<*>): Boolean {
        return !isEmpty(collection)
    }

    fun isEmpty(collection: Collection<*>?): Boolean {
        return collection == null || collection.isEmpty()
    }

    fun isNull(collection: Collection<*>?): Boolean {
        return collection == null
    }


    fun size(collection: Collection<*>?): Int {
        if (collection == null)
            return 0
        return if (collection.isEmpty()) 0 else collection.size

    }


    /*
     * =================== LIST ==========================
     * */
    fun emptyList(): List<*>? {
        return emptyList()
    }

    /*
     * =================== SET ==========================
     * */
    fun emptySet(): Set<*>? {
        return emptySet()
    }

    /*
     * =================== MAP ==========================
     * */
    fun emptyMap(): Map<*, *>? {
        return emptyMap()
    }
}
