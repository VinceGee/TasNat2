package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import zw.co.vokers.vinceg.tasnat.Main2Activity;
import zw.co.vokers.vinceg.tasnat.R;

/**
 * Created by Vince G on 11/1/2019
 */

public class ThankyouActivity extends AppCompatActivity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);

        /**TO-DO
         * Add a hander to flash the summary then return to Main menu
         *
         * **/

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(ThankyouActivity.this, Main2Activity.class);
                startActivity(i);

                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
