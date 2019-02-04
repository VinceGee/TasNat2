package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.adapters.DiscountListViewAdapter;
import zw.co.vokers.vinceg.tasnat.adapters.FilterGridviewAdapter;
import zw.co.vokers.vinceg.tasnat.adapters.FilterListViewAdapter;
import zw.co.vokers.vinceg.tasnat.adapters.PaymentsListAdapter;
import zw.co.vokers.vinceg.tasnat.models.DiscountBeanclass;
import zw.co.vokers.vinceg.tasnat.models.GridBeanclass;
import zw.co.vokers.vinceg.tasnat.models.ListBeanclass;
import zw.co.vokers.vinceg.tasnat.models.PaymentBeanClass;
import zw.co.vokers.vinceg.tasnat.utils.ExpandableHeightGridView;
import zw.co.vokers.vinceg.tasnat.views.RangeBar;

/**
 * Created by Vince G on 11/1/2019
 */

public class FilterActivity extends AppCompatActivity {

    private RangeBar rangebar1;

    private ListView listview;
    private ArrayList<ListBeanclass> Bean;
    private FilterListViewAdapter baseAdapter;

    private ExpandableHeightGridView gridview;
    private ArrayList<GridBeanclass> beanclassArrayList;
    private FilterGridviewAdapter gridviewAdapter;

    private ListView discountview;
    private ListView paymentsview;
    private ArrayList<DiscountBeanclass> discountArrayList;
    private ArrayList<PaymentBeanClass> paymentArrayList;
    private DiscountListViewAdapter discountAdapter;
    private PaymentsListAdapter paymentsListAdapter;

    private View view;
    TextView categories, brands, colour, price, discount,paymentMeth;
    LinearLayout brandlist, pricelist, colourlist, discountlist, paymentMethList;
    Typeface fonts1;
    Button rang1,rang2;
    Context context;

    private String[] TITLE = {"Aviri", "Aoe", "Akobi", "Badboys", "Bindash", "Catgirl", "Caty", "Droni", "Dinnia"};
    private int[] IMAGEgrid = {R.drawable.round1, R.drawable.round2, R.drawable.round3, R.drawable.round4, R.drawable.round5, R.drawable.round6};
    private String[] DISCOUNT = {"0 - 10 %","10 - 15 %","20 - 30 %","40 - 50 %"};
    private String[] PAYMENTS = {"USD","RTGS Transfer","EcoCash","Bond"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        fonts1 =  Typeface.createFromAsset(FilterActivity.this.getAssets(), "fonts/MavenPro-Regular.ttf");

        Button t5 =(Button)findViewById(R.id.rang1);
        t5.setTypeface(fonts1);
        Button t6 =(Button)findViewById(R.id.rang2);
        t6.setTypeface(fonts1);


        listview = (ListView) findViewById(R.id.listview);
        gridview = (ExpandableHeightGridView) findViewById(R.id.gridview);
        discountview = (ListView) findViewById(R.id.discountview);
        paymentsview = (ListView) findViewById(R.id.paymentMethodList);

        categories = (TextView) findViewById(R.id.categories);

        brands = (TextView) findViewById(R.id.brands);
        brandlist = (LinearLayout) findViewById(R.id.brandlist);

        colour = (TextView) findViewById(R.id.colour);
        colourlist = (LinearLayout) findViewById(R.id.colourlist);

        price = (TextView) findViewById(R.id.price);
        pricelist = (LinearLayout) findViewById(R.id.pricelist);


        discount = (TextView) findViewById(R.id.discount);
        discountlist = (LinearLayout) findViewById(R.id.discountlist);

        paymentMeth = (TextView) findViewById(R.id.leftPaymentMethod);
        paymentMethList = (LinearLayout) findViewById(R.id.paymentMethod);


        brands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("1");

            }
        });
        colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("2");

            }
        });
        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("3");

            }
        });
        discount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("4");

            }
        });

        paymentMeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("5");

            }
        });

//                 ******LIST*********
        Bean = new ArrayList<ListBeanclass>();

        for (int i = 0; i < TITLE.length; i++) {
            ListBeanclass bean = new ListBeanclass(TITLE[i]);
            Bean.add(bean);
        }


        baseAdapter = new FilterListViewAdapter(FilterActivity.this, Bean) {
        };

        listview.setAdapter(baseAdapter);

//                 ******DISCOUNT*********
        discountArrayList = new ArrayList<DiscountBeanclass>();

        for (int i = 0; i < DISCOUNT.length; i++) {
            DiscountBeanclass bean1 = new DiscountBeanclass(DISCOUNT[i]);
            discountArrayList.add(bean1);
        }

        discountAdapter = new DiscountListViewAdapter(FilterActivity.this, discountArrayList) {
        };

        discountview.setAdapter(discountAdapter);

        //                 ******PAYMENT METH*********
        paymentArrayList = new ArrayList<PaymentBeanClass>();

        for (int i = 0; i < PAYMENTS.length; i++) {
            PaymentBeanClass beanPay = new PaymentBeanClass(PAYMENTS[i]);
            paymentArrayList.add(beanPay);
        }

        paymentsListAdapter = new PaymentsListAdapter(FilterActivity.this, paymentArrayList){};

        paymentsview.setAdapter(paymentsListAdapter);

        //        ********GRIDVIEW***********
        beanclassArrayList = new ArrayList<GridBeanclass>();

        for (int i = 0; i < IMAGEgrid.length; i++) {

            GridBeanclass beanclass = new GridBeanclass(IMAGEgrid[i]);
            beanclassArrayList.add(beanclass);

        }
        gridviewAdapter = new FilterGridviewAdapter(FilterActivity.this,beanclassArrayList);
        gridview.setExpanded(true);

        gridview.setAdapter(gridviewAdapter);
    }

    private void clickb(String s) {


        brands.setTextColor(Color.parseColor("#353944"));
        brandlist.setVisibility(View.GONE);
        colour.setTextColor(Color.parseColor("#353944"));
        colourlist.setVisibility(View.GONE);
        price.setTextColor(Color.parseColor("#353944"));
        pricelist.setVisibility(View.GONE);
        discount.setTextColor(Color.parseColor("#353944"));
        discountlist.setVisibility(View.GONE);
        paymentMeth.setTextColor(Color.parseColor("#353944"));
        paymentMethList.setVisibility(View.GONE);


        if (s.equalsIgnoreCase("1")) {

            brandlist.setVisibility(View.VISIBLE);
            brands.setTextColor(Color.parseColor("#ff5254"));
        } else if (s.equalsIgnoreCase("2")) {

            colourlist.setVisibility(View.VISIBLE);
            colour.setTextColor(Color.parseColor("#ff5254"));
        } else if (s.equalsIgnoreCase("3")) {

            pricelist.setVisibility(View.VISIBLE);
            price.setTextColor(Color.parseColor("#ff5254"));
        } else if (s.equalsIgnoreCase("4")) {

            discountlist.setVisibility(View.VISIBLE);
            discount.setTextColor(Color.parseColor("#ff5254"));
        }else if (s.equalsIgnoreCase("5")) {

            paymentMethList.setVisibility(View.VISIBLE);
            paymentMeth.setTextColor(Color.parseColor("#ff5254"));
        }


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        rangebar1 = (RangeBar) findViewById(R.id.rangebar1);

        final Button leftIndexValue = (Button) findViewById(R.id.rang1);
        final Button rightIndexValue = (Button) findViewById(R.id.rang2);

        // Sets the display values of the indices
        rangebar1.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex,
                                              int rightPinIndex,
                                              String leftPinValue, String rightPinValue) {
                leftIndexValue.setText("$" + leftPinIndex);
                rightIndexValue.setText("$" + rightPinIndex);
            }

        });





    }

}

