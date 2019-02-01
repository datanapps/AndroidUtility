package datanapps.androidutility.utils.kotlin

import java.io.File

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
}
