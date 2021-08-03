package datanapps.androidutility.utils.extension

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Context.CONNECTIVITY_SERVICE
import android.net.ConnectivityManager
import android.net.NetworkCapabilities.NET_CAPABILITY_INTERNET
import android.os.Build
import androidx.core.content.ContextCompat


/*
 * create by yogendrapratapsingh
 * on 2/8/21
 */

/*
*
* Copy clip text enter whatever text
*
* */
fun Context.copyToClipboard(text: CharSequence){
    val clipboard = ContextCompat.getSystemService(this, ClipboardManager::class.java)
    val clip = ClipData.newPlainText("label",text)
    clipboard?.setPrimaryClip(clip)
}

/*
*
* Check internet connection
*
* */
@Suppress("DEPRECATION")
fun Context.isNetworkAvailable(): Boolean {
    val cm = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        val capabilities = cm.getNetworkCapabilities(cm.activeNetwork)
        capabilities?.hasCapability(NET_CAPABILITY_INTERNET) == true
    } else {
        return  cm.activeNetworkInfo?.isConnectedOrConnecting == true
    }
}

/*
Check no internet connection
* */
fun Context.isNetworkNotAvailable(): Boolean = !isNetworkAvailable()



