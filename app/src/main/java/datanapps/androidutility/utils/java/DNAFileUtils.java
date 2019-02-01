package datanapps.androidutility.utils.java;

import java.io.File;

public class DNAFileUtils {

    // suffix jpg
    public static final String JPG = ".jpg";

    // suffix png
    public static final String PNG = ".png";

    public static boolean isFileExist(String filePath) {
        return filePath != null && new File(filePath).exists();
    }

    public static boolean isFileExist(File file) {
        return file != null && file.exists();
    }


    /*
     * Create JPG image file
     * */
    public static File createJPGImageFile(File dir) {
        try {
            File image = File.createTempFile(
                    "IMG_" + System.currentTimeMillis(),  /* prefix */
                    ".jpg",         /* suffix */
                    dir     /* directory */
            );
            return image;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    /*
     * Create JPG image file
     * */
    public static File createFile(File dir, String suffix) {
        try {
            File image = File.createTempFile(
                    "IMG_" + System.currentTimeMillis(),  /* prefix */
                    suffix,         /* suffix */
                    dir     /* directory */
            );
            return image;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    /*
     * Create mp4 file
     * */

    public static File createMp4File(File dir) {
        try {
            File image = File.createTempFile(
                    "IMG_" + System.currentTimeMillis(),  /* prefix */
                    ".mp4",         /* suffix */
                    dir     /* directory */
            );
            return image;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static String getFileSize(String filePath) {
        int fileSize = 0;
        if (filePath != null) {
            File file = new File(filePath);
            return getFileSize(file);
        }
        return fileSize + " KB";
    }

    public static String getFileSize(File file) {
        int fileSize = 0;
        if (file != null && file.exists()) {
            fileSize = Integer.parseInt(String.valueOf(file.length() / 1024));
            if (fileSize >= 1024) {
                return (fileSize / 1024) + " MB";
            } else {
                return fileSize + " KB";
            }
        }
        return fileSize + " KB";
    }
}
