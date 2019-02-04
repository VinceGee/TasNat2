package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.utils.VokersRegularText;

/**
 * Created by Vince G on 10/1/2019
 */

public class SignUp extends AppCompatActivity {

    VokersRegularText signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);


        signin = (VokersRegularText) findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(SignUp.this, SignIn.class);
                startActivity(it);

            }
        });


    }
}

