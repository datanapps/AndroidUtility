package datanapps.androidutility;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import datanapps.androidutility.utils.java.DNADeviceUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.testBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkMsg();
            }
        });
    }


    private void checkMsg() {

        Log.i("DNA", "SERIAL: " + DNADeviceUtils.getSerial());
        Log.i("DNA","MODEL: " + DNADeviceUtils.getModel());
        Log.i("DNA","ID: " + DNADeviceUtils.getDeviceId());
        Log.i("DNA","Manufacture: " + DNADeviceUtils.getManufacturer());
        Log.i("DNA","brand: " + DNADeviceUtils.getBrand());
        Log.i("DNA","type: " + DNADeviceUtils.getType());
        Log.i("DNA","user: " + DNADeviceUtils.getUser());
        Log.i("DNA","BASE: " + DNADeviceUtils.getBaseVersionCode());
        Log.i("DNA","INCREMENTAL " + DNADeviceUtils.getVersionIncremental());
        Log.i("DNA","SDK  " + DNADeviceUtils.getSDKVersion());
        Log.i("DNA","BOARD: " + DNADeviceUtils.getBoard());
        Log.i("DNA","HOST " + DNADeviceUtils.getDeviceHost());
        Log.i("DNA","FINGERPRINT: "+DNADeviceUtils.getDeviceFingerprint());
        Log.i("DNA","Version Code: " + DNADeviceUtils.getVersionRelease());

    }
}
