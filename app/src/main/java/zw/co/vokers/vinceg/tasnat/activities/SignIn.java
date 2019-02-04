package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import zw.co.vokers.vinceg.tasnat.MainActivity;
import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.utils.VokersRegularText;

/**
 * Created by Vince G on 10/1/2019
 */

public class SignIn extends AppCompatActivity {
    VokersRegularText signin, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        signin = (VokersRegularText)findViewById(R.id.signin1);
        signup = (VokersRegularText)findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, MainActivity.class));
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(SignIn.this, SignUp.class);
                startActivity(it);

            }
        });
    }
}

