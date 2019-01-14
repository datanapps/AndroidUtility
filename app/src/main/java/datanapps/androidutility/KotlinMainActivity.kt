package datanapps.androidutility

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import datanapps.androidutility.utils.kotlin.DNALog

class KotlinMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DNALog.d("this is test message");
    }
}
