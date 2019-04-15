package datanapps.androidutility.utils.kotlin

import android.webkit.MimeTypeMap
import java.io.File


/*
 *
 * Yogendra
 * 11/01/2019
 *
 * */

object DNAFileUtils {


    // suffix jpg
    val JPG = ".jpg"

    // suffix png
    val PNG = ".png"



    fun isFileExist(filePath: String?): Boolean {
        return filePath != null && File(filePath).exists()
    }

    fun isFileExist(file: File?): Boolean {
        return file != null && file.exists()
    }


    /*
     * Create JPG image file
     * */
    fun createJPGImageFile(dir: File?): File? {
        try {
            return File.createTempFile(
                    "IMG_" + System.currentTimeMillis(), /* prefix */
                    ".jpg", /* suffix */
                    dir     /* directory */
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return null
    }


    /*
    * Create file with suffix
    * */
    fun createFile(dir: File?, suffix:String?): File? {
        try {
            return File.createTempFile(
                    "IMG_" + System.currentTimeMillis(), /* prefix */
                    suffix, /* suffix */
                    dir     /* directory */
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return null
    }


    /*
    * Create mp4 file
    * */

    fun createMp4File(dir: File): File? {
        try {
            return File.createTempFile(
                    "IMG_" + System.currentTimeMillis(), /* prefix */
                    ".mp4", /* suffix */
                    dir     /* directory */
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return null
    }


    // get file mime type
    fun getMimeType(filePath: String): String? {
        var type: String? = null
        val extension = MimeTypeMap.getFileExtensionFromUrl(filePath)
        if (extension != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
        }
        return type
    }
}
