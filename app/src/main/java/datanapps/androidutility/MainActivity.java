package datanapps.androidutility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import java.util.ArrayList;
import java.util.Collections;

import datanapps.androidutility.utils.java.DNAAppUtils;
import datanapps.androidutility.utils.java.DNACollectionUtils;
import datanapps.androidutility.utils.kotlin.DNALog;
import datanapps.androidutility.utils.java.DNASnackBar;
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

        //DNALog.Companion.d("this is debug message");


       // DNASnackBar.show(this, " this is test message");
        DNAToast.show(this, " this is test message");


        //DNAAppUtils.getApplicationId();

       /* List<T> mediaList = new ArrayList();
        if (DNACollectionUtils.isEmpty(mediaList)) {
            // do your stuff
        }

        if (DNACollectionUtils.isNotEmpty(mediaList)) {
// do your stuff
        }*/
    }
}
