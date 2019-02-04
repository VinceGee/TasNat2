package zw.co.vokers.vinceg.tasnat.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.adapters.PeopleViewedRecyclerViewAdapter;
import zw.co.vokers.vinceg.tasnat.models.BeanlistPeopleViewed;
import zw.co.vokers.vinceg.tasnat.utils.VokersRegularText;

/**
 * Created by Vince G on 11/1/2019
 */

public class ProductDetailActivity extends AppCompatActivity {

    ImageView plus,minus;
    TextView cartno,cutprice,change,changeno;
    VokersRegularText viewMore;
    int counter = 0;
    Dialog myDialog1;
    EditText numberpopup;
    RatingBar ratingbar;

    private RecyclerView rv2;
    private ArrayList<BeanlistPeopleViewed> Bean1;
    private PeopleViewedRecyclerViewAdapter baseAdapter1;
    private Context context;

    //    *****Trending string*******
    private int[] IMAGET = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TITLET = {"Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel"};
    private String[] PRICE = {"1200 Rs", "1200 Rs", "1200 Rs", "1200 Rs"};
    private String[] CUTPRICE = {"200 Rs", "200 Rs", "200 Rs", "200 Rs"};
    private String[] DISCOUNTT = {"15%", "10%", "25%", "50%"};
    private String[] RATINGTEXTT = {"(1234)", "(2322)", "(4322)", "(1223)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetail);


        //*********RECYCLERVIEWS*********

        rv2 = (RecyclerView)findViewById(R.id.rv2);

        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        rv2.setLayoutManager(mLayoutManager1);


        Bean1 = new ArrayList<BeanlistPeopleViewed>();

        for (int i= 0; i< TITLET.length; i++){

            BeanlistPeopleViewed bean1 = new BeanlistPeopleViewed(IMAGET[i], TITLET[i], PRICE[i], CUTPRICE[i],DISCOUNTT[i], RATINGTEXTT[i]);
            Bean1.add(bean1);

        }


        baseAdapter1 = new PeopleViewedRecyclerViewAdapter(this,ProductDetailActivity.this, Bean1) {
        };

        rv2.setAdapter(baseAdapter1);

        change = (TextView) findViewById(R.id.change);

        changeno = (TextView) findViewById(R.id.changeno);


//*******Text thru Line********
        cutprice = (TextView) findViewById(R.id.cutprice);
        cutprice.setPaintFlags(cutprice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

//********PRODUCT PLUS MINUS*************
        plus = (ImageView)findViewById(R.id.plus);
        minus = (ImageView)findViewById(R.id.minus);
        cartno = (TextView) findViewById(R.id.cartno);

        final int[] number = {0};
        cartno.setText(""+ number[0]);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number[0] == 0){
                    cartno.setText("" + number[0]);
                }

                if (number[0] > 0){

                    number[0] = number[0] -1;
                    cartno.setText(""+ number[0]);
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number[0] == 9) {
                    cartno.setText("" + number[0]);
                }

                if (number[0] < 9) {

                    number[0] = number[0] + 1;
                    cartno.setText("" + number[0]);

                }
            }
        });

        viewMore = (VokersRegularText) findViewById(R.id.viewMoreText);

        viewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductDetailActivity.this, ItemDetailActivity.class));
            }
        });

//        ***********ratingBar**********
        ratingbar = (RatingBar) findViewById(R.id.ratingbar);
        LayerDrawable stars = (LayerDrawable) ratingbar.getProgressDrawable();
        stars.getDrawable(2).setColorFilter(getResources().getColor(R.color.yellow), PorterDuff.Mode.SRC_ATOP);


        //        *********POPUP*************

        changeno.setText("000000");
        changeno.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                myDialog1 = new Dialog(ProductDetailActivity.this);
                myDialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);
                myDialog1.setCancelable(true);
                myDialog1.setContentView(R.layout.popup_change);
                myDialog1.show();

                numberpopup = (EditText) myDialog1.findViewById(R.id.numberpopup);

                TextView button = (TextView) myDialog1.findViewById(R.id.button);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        if(numberpopup.getText().toString().equalsIgnoreCase("")||numberpopup.getText().toString().equalsIgnoreCase(null)) {

                            Toast.makeText(ProductDetailActivity.this,"write a code",Toast.LENGTH_LONG).show();

                        }

                        else{


                            changeno.setText(numberpopup.getText().toString());
                            myDialog1.dismiss();


                        }
                    }
                });
            }
        });





    }
}

