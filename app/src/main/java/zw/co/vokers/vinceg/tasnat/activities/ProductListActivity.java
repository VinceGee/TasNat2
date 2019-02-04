package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.adapters.GridviewAdapter;
import zw.co.vokers.vinceg.tasnat.adapters.ListviewAdapter;
import zw.co.vokers.vinceg.tasnat.models.Beanclass;
import zw.co.vokers.vinceg.tasnat.models.BeanclassList;
import zw.co.vokers.vinceg.tasnat.utils.ExpandableHeightGridView;
import zw.co.vokers.vinceg.tasnat.utils.ExpandableHeightListView;
import zw.co.vokers.vinceg.tasnat.utils.VokersRegularText;

/**
 * Created by Vince G on 11/1/2019
 */

public class ProductListActivity extends AppCompatActivity {

    private ExpandableHeightGridView gridview;
    private ArrayList<Beanclass> beanclassArrayList;
    private GridviewAdapter gridviewAdapter;
    VokersRegularText refiner;
    private ExpandableHeightListView listview;
    private ArrayList<BeanclassList>Bean;
    private ListviewAdapter baseAdapter;

    ImageView gridviewicon,listviewicon;


    private int[] IMAGE = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TITLE = {"Casual Sleeveless", "Short Sleeve ", "Sleeve Graphic Print", "Roundneck Sleeve", "Casual Sleeveless", "Short Sleeve "};
    private String[] PRICE = {"Rs. 1,499", "Rs. 1,899", "Rs. 1,299", "Rs. 1,199", "Rs. 1,499", "Rs. 1,899"};
    private String[] CUTPRICE = {"Rs. 1,699", "Rs. 1,999", "Rs. 1,599", "Rs. 1,399", "Rs. 1,699", "Rs. 1,999"};
    private String[] DISCOUNT = {"10%", "14%", "20%", "25%","10%", "14%"};
    private String[] RATING = {"(1231)", "(2331)", "(2321)", "(3213)","(4322)", "(2432)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);


        refiner = (VokersRegularText) findViewById(R.id.refiner);

        refiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProductListActivity.this, FilterActivity.class));
            }
        });
//              ********GRIDVIEW***********


        gridview = (ExpandableHeightGridView)findViewById(R.id.gridview);
        beanclassArrayList= new ArrayList<Beanclass>();

        for (int i= 0; i< IMAGE.length; i++) {

            Beanclass beanclass = new Beanclass(IMAGE[i], TITLE[i], PRICE[i], CUTPRICE[i], DISCOUNT[i], RATING[i]);
            beanclassArrayList.add(beanclass);

        }
        gridviewAdapter = new GridviewAdapter(this,ProductListActivity.this, beanclassArrayList);
        gridview.setExpanded(true);

        gridview.setAdapter(gridviewAdapter);

//        /        ********LISTVIEW***********


        listview = (ExpandableHeightListView)findViewById(R.id.listview);


        Bean = new ArrayList<BeanclassList>();

        for (int i= 0; i< TITLE.length; i++){

            BeanclassList BeanclassList = new BeanclassList(IMAGE[i], TITLE[i], PRICE[i], CUTPRICE[i], DISCOUNT[i], RATING[i]);
            Bean.add(BeanclassList);

        }

        baseAdapter = new ListviewAdapter(this,ProductListActivity.this, Bean) {
        };

        listview.setAdapter(baseAdapter);



//        ***********Grid - list view **********

        gridviewicon = (ImageView) findViewById(R.id.gridviewicon);
        listviewicon = (ImageView)findViewById(R.id.listviewicon);


        gridviewicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                listviewicon.setVisibility(View.VISIBLE);
                gridviewicon.setVisibility(View.GONE);
                listview.setVisibility(View.VISIBLE);
                gridview.setVisibility(View.GONE);

            }
        });

        listviewicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                listviewicon.setVisibility(View.GONE);
                gridviewicon.setVisibility(View.VISIBLE);
                listview.setVisibility(View.GONE);
                gridview.setVisibility(View.VISIBLE);



            }
        });



    }
}

