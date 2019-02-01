package datanapps.androidutility;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;


import java.io.File;

import datanapps.androidutility.utils.java.DNADateUtils;
import datanapps.androidutility.utils.java.DNAFileUtils;
import datanapps.androidutility.utils.java.DNALog;
import datanapps.androidutility.utils.java.DNASharedPreferenceUtils;
import datanapps.androidutility.utils.java.DNAToast;


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


        // for save value
       //int size = DNAFileUtils.getFileSize(file);

        //get value
        DNALog.d(" date :  "+ DNASharedPreferenceUtils.getString("key"));



        DNALog.d(" 22 jan :  "+ DNADateUtils.getTimeAgo(1548905100000L));


        //DNAToast.show(this, " this is test message");

    }
}
