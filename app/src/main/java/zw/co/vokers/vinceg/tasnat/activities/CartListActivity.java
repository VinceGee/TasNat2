package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.adapters.CartListBaseAdapter;
import zw.co.vokers.vinceg.tasnat.models.CartListBeanlist;
import zw.co.vokers.vinceg.tasnat.utils.VokersRegularText;

/**
 * Created by Vince G on 11/1/2019
 */

public class CartListActivity extends AppCompatActivity {
    private ListView listview;
    Typeface fonts1,fonts2;
    VokersRegularText placeOrder;

    private int[] IMAGE = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo,
            R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};

    private String[] TITLE = {"Teak & Steel Petanque Set", "Lemon Peel Baseball", "Seil Marschall Hiking Pack", "Teak & Steel Petanque Set", "Lemon Peel Baseball", "Seil Marschall Hiking Pack", "Teak & Steel Petanque Set"};


    private String[] PRICE = {"$ 220.00","$ 49.00","$ 320.00","$ 220.00","$ 49.00","$ 320.00","$ 220.00"};
    private ArrayList<CartListBeanlist> Bean;
    private CartListBaseAdapter baseAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartlist);

        placeOrder = (VokersRegularText) findViewById(R.id.pay);

        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartListActivity.this, PlaceOrderActivity.class));
            }
        });

        listview = (ListView)findViewById(R.id.listview);
        Bean = new ArrayList<CartListBeanlist>();

        for (int i= 0; i< TITLE.length; i++){
            CartListBeanlist bean = new CartListBeanlist(IMAGE[i], TITLE[i],PRICE[i]);
            Bean.add(bean);
        }

        baseAdapter = new CartListBaseAdapter(CartListActivity.this, Bean) {
        };

        listview.setAdapter(baseAdapter);


    }
}

