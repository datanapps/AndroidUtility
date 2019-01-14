package datanapps.androidutility.utils.java;

import java.io.File;

public class DNAFileUtils {
    
    public static boolean isFileExist(String filePath) {
        return  filePath!=null && new File(filePath).exists();
    }

    public static boolean isFileExist(File file) {
        return file!=null && file.exists();
    }


    /*
     * Create JPG image file
     * */
    public static  File createJPGImageFile(File dir) {
        try {
             File image = File.createTempFile(
                     "IMG_" + System.currentTimeMillis(),  /* prefix */
                    ".jpg",         /* suffix */
                    dir     /* directory */
            );
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }


    /*
    * Create mp4 file
    * */

    public static  File createMp4File(File dir) {
        try {
            File image = File.createTempFile(
                    "IMG_" + System.currentTimeMillis(),  /* prefix */
                    ".mp4",         /* suffix */
                    dir     /* directory */
            );
            return image;
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
