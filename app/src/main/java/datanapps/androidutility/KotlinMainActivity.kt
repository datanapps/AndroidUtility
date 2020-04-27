package datanapps.androidutility

import android.os.Bundle

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import datanapps.androidutility.utils.kotlin.DNADeviceUtils
import datanapps.androidutility.utils.kotlin.DNAFileUtils
import datanapps.androidutility.utils.kotlin.DNALog
import datanapps.androidutility.utils.kotlin.DNASnackBar

class KotlinMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DNALog.d("this is test message");

        DNASnackBar.show(this, "")



        DNAFileUtils.createJPGImageFile(getExternalFilesDir(""))
       //DNACollectionUtils.isEmpty()
    }

    fun checkMsg(){


        Log.i("DNA", "SERIAL: " + DNADeviceUtils.baseVersionCode)
    }
}
