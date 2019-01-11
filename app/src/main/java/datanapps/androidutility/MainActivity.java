package datanapps.androidutility;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import datanapps.androidutility.utils.DNALog;
import datanapps.androidutility.utils.DNASnackBar;
import datanapps.androidutility.utils.DNAToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void chekLog(){

        DNALog.d("this is debug message");


        DNASnackBar.show( this," this is test message");
        DNAToast.show(this, " this is test message");
    }
}
