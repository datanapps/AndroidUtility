package datanapps.androidutility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import datanapps.androidutility.utils.DNALog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void chekLog(){

        DNALog.d("this is debug message");


    }
}
