package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.utils.VokersRegularText;

/**
 * Created by Vince G on 11/1/2019
 */

public class PlaceOrderActivity extends AppCompatActivity {
    LinearLayout home0,offer0,fav0,bag0,profile0;
    ImageView home,offer,fav,bag,profile;
    VokersRegularText goToAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeorder);

        goToAddress = (VokersRegularText) findViewById(R.id.goToAddress);

        goToAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PlaceOrderActivity.this, AddressActivity.class));
            }
        });


//        //     *******BOT BAR COLOR *********
//        home = (ImageView) findViewById(R.id.home);
//        home0 = (LinearLayout) findViewById(R.id.home0);
//        offer = (ImageView) findViewById(R.id.offer);
//        offer0 = (LinearLayout) findViewById(R.id.offer0);
//        fav = (ImageView) findViewById(R.id.fav);
//        fav0 = (LinearLayout) findViewById(R.id.fav0);
//        bag = (ImageView) findViewById(R.id.bag);
//        bag0 = (LinearLayout) findViewById(R.id.bag0);
//        profile = (ImageView) findViewById(R.id.profile);
//        profile0 = (LinearLayout) findViewById(R.id.profile0);
//
//
//        home.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        offer.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        fav.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        bag.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        profile.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//
//        home0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                clickb("1");
//
//            }
//        });
//        offer0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                clickb("2");
//
//            }
//        });
//        fav0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                clickb("3");
//
//            }
//        });
//        bag0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                clickb("4");
//
//            }
//        });
//        profile0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                clickb("5");
//
//            }
//        });
//
//    }
//
//
//
//    private void clickb(String s) {
//
//        home.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        offer.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        fav.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        bag.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//        profile.setColorFilter(getResources().getColor(R.color.iconcolour), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//
//
//        if(s.equalsIgnoreCase("1")) {
//
//            home.setColorFilter(getResources().getColor(R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//        }
//
//
//        else if(s.equalsIgnoreCase("2")) {
//
//            offer.setColorFilter(getResources().getColor(R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//        }
//        else if(s.equalsIgnoreCase("3")) {
//
//            fav.setColorFilter(getResources().getColor(R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//        }
//        else if(s.equalsIgnoreCase("4")) {
//
//            bag.setColorFilter(getResources().getColor(R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//        }
//        else if(s.equalsIgnoreCase("5")) {
//
//            profile.setColorFilter(getResources().getColor(R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
//
//        }

    }
}

