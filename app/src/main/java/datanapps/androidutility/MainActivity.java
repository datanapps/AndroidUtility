package datanapps.androidutility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import datanapps.androidutility.utils.kotlin.DNALog;
import datanapps.androidutility.utils.java.DNASnackBar;
import datanapps.androidutility.utils.java.DNAToast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void chekLog(){

        //DNALog.Companion.d("this is debug message");


        DNASnackBar.show( this," this is test message");
        DNAToast.show(this, " this is test message");
    }
}
