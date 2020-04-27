package datanapps.androidutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import datanapps.androidutility.utils.java.DNALog;


public class BatteryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerReceiver(this.mBatInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

    }


    private BroadcastReceiver mBatInfoReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context c, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            int voltage = intent.getIntExtra("voltage", 0);
            int temperature = intent.getIntExtra("temperature", 0);

            int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
            boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                    status == BatteryManager.BATTERY_STATUS_FULL;

            int chargePlug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
            boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
            boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;

            DNALog.d("Is Charging :" + String.valueOf(isCharging) );
            DNALog.d("Charging Type  USB:" + String.valueOf(usbCharge) );
            DNALog.d("Charging Type  AC:" + String.valueOf(acCharge) );
            DNALog.d("Battery Status: " + String.valueOf(status) + "%");
            DNALog.d("Battery Level: " + String.valueOf(level) + "%");
            DNALog.d("Battery Voltage: " + String.valueOf(voltage));
            double temps = (double)temperature / 10;
            DNALog.d("Battery Temperature: " + String.valueOf(temps));
        }
    };
}
