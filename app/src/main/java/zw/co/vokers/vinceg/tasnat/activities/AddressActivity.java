package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.utils.VokersRegularText;

/**
 * Created by Vince G on 11/1/2019
 */

public class AddressActivity extends AppCompatActivity {

    VokersRegularText addrDone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        addrDone = (VokersRegularText) findViewById(R.id.addressDone);

        addrDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddressActivity.this, PaymentActivity.class));
            }
        });
    }
}

