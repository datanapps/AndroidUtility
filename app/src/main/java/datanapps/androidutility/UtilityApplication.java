package datanapps.androidutility;

import android.app.Application;
import android.content.Context;

import datanapps.androidutility.utils.java.DNASharedPreferenceUtils;

public class UtilityApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // java
        DNASharedPreferenceUtils.init(this);
        //pass custom parameter
        DNASharedPreferenceUtils.init(this, "preference_name", Context.MODE_PRIVATE);



        //kotlin
        datanapps.androidutility.utils.kotlin.DNASharedPreferenceUtils.INSTANCE.init(this);
        //pass custom parameter
        datanapps.androidutility.utils.kotlin.DNASharedPreferenceUtils.INSTANCE.init(this, "preference_name", Context.MODE_PRIVATE);


    }
}
