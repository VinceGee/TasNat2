package zw.co.vokers.vinceg.tasnat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.glide.slider.library.SliderLayout;
import com.glide.slider.library.SliderTypes.BaseSliderView;
import com.glide.slider.library.SliderTypes.TextSliderView;
import com.glide.slider.library.Tricks.ViewPagerEx;

import java.util.ArrayList;
import java.util.HashMap;

import zw.co.vokers.vinceg.tasnat.activities.CartListActivity;
import zw.co.vokers.vinceg.tasnat.activities.CategoriesActivity;
import zw.co.vokers.vinceg.tasnat.adapters.BrandsRecyclerViewAdapter;
import zw.co.vokers.vinceg.tasnat.adapters.GroomingRecyclerViewAdapter;
import zw.co.vokers.vinceg.tasnat.adapters.TrendingRecyclerViewAdapter;
import zw.co.vokers.vinceg.tasnat.models.BeanlistBrands;
import zw.co.vokers.vinceg.tasnat.models.BeanlistGrooming;
import zw.co.vokers.vinceg.tasnat.models.BeanlistTrending;
import zw.co.vokers.vinceg.tasnat.utils.ChildAnimationExample;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, BaseSliderView.OnSliderClickListener,ViewPagerEx.OnPageChangeListener {

    SliderLayout mDemoSlider;
    LinearLayout categories;
    private RecyclerView rv,rv2,rv3;
    private ArrayList<BeanlistGrooming> Bean;
    private GroomingRecyclerViewAdapter baseAdapter;
    private ArrayList<BeanlistTrending> Bean1;
    private TrendingRecyclerViewAdapter baseAdapter1;
    private ArrayList<BeanlistBrands> Bean2;
    private BrandsRecyclerViewAdapter baseAdapter2;
    private Context context;
    Typeface fonts1,fonts2,fonts3,fonts4;
    TextView eshop,shirt1,jeans1,shoes1,slippers1,goggles1,groomingproducts,trendingproducts,topbrands;
    EditText searchtext;
    LinearLayout home0,offer0,fav0,bag0,noti0, ordersLinear;
    ImageView home,offer,fav,bag,noti;

    //    *****Grooming string*******
    private int[] IMAGEG = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TITLEG = {"Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel"};
    private String[] DESCRIPTIONG = {"1200 Rs", "1200 Rs", "1200 Rs", "1200 Rs"};
    private String[] DATEG = {"200 Rs", "200 Rs", "200 Rs", "200 Rs"};
    private String[] DISCOUNTG = {"15%", "10%", "25%", "50%"};
    private String[] RATINGTEXTG = {"(1234)", "(2322)", "(4322)", "(1223)"};

    //    *****Trending string*******
    private int[] IMAGET = {R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TITLET = {"Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel", "Canvera Black Heel"};
    private String[] DESCRIPTIONT = {"1200 Rs", "1200 Rs", "1200 Rs", "1200 Rs"};
    private String[] DATET = {"200 Rs", "200 Rs", "200 Rs", "200 Rs"};
    private String[] DISCOUNTT = {"15%", "10%", "25%", "50%"};
    private String[] RATINGTEXTT = {"(1234)", "(2322)", "(4322)", "(1223)"};

    //    *****TOP Brands string*******
    private int[] IMAGEB = {R.drawable.shoppy_logo, R.drawable.shoppy_logo};
    private String[] TEXT1 = {"Mercedes Benz", "Mazda"};
    private String[] TEXT2 = {"BMW", "Mitsubishi"};
    private String[] TEXT3 = {"Toyota", "Subaru"};
    private String[] TEXT4 = {"Nissan", "Isuzu"};
    private String[] TEXT5 = {"Honda", "Volkswagon"};
    private String[] TEXT6 = {"See More","See More"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.realtoolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer2_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav2_view);
        navigationView.setNavigationItemSelectedListener(this);

        View hView =  navigationView.getHeaderView(0);

        eshop = (TextView) findViewById(R.id.eshop);
        shirt1 = (TextView) findViewById(R.id.shirt1);
        jeans1 = (TextView) findViewById(R.id.jeans1);
        shoes1 = (TextView) findViewById(R.id.shoes1);
        slippers1 = (TextView) findViewById(R.id.slippers1);
        goggles1 = (TextView) findViewById(R.id.goggles1);
        groomingproducts = (TextView) findViewById(R.id.groomingproducts);
        trendingproducts = (TextView) findViewById(R.id.trendingproducts);
        topbrands = (TextView) findViewById(R.id.topbrands);
        searchtext = (EditText) findViewById(R.id.searchtext);

        //     *******DRAWER MENU *********
        categories = (LinearLayout) hView.findViewById(R.id.categoriesLayout);

        ordersLinear = (LinearLayout) hView.findViewById(R.id.ordersLinearMenu);



        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, CategoriesActivity.class));
            }
        });

        ordersLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, CartListActivity.class));
            }
        });


//     *******BOT BAR COLOR *********
        home = (ImageView) findViewById(R.id.home);
        home0 =(LinearLayout)findViewById(R.id.home0);
        offer = (ImageView) findViewById(R.id.offer);
        offer0 =(LinearLayout)findViewById(R.id.offer0);
        fav = (ImageView) findViewById(R.id.fav);
        fav0 =(LinearLayout)findViewById(R.id.fav0);
        bag = (ImageView) findViewById(R.id.bag);
        bag0 =(LinearLayout)findViewById(R.id.bag0);
        noti = (ImageView) findViewById(R.id.noti);
        noti0 =(LinearLayout)findViewById(R.id.noti0);

//        home.setColorFilter(getResources().getColor(R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
        home.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        offer.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        fav.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        bag.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        noti.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);


        home0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("1");

            }
        });
        offer0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("2");

            }
        });
        fav0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("3");

            }
        });
        bag0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("4");

            }
        });
        noti0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickb("5");

            }
        });


        fonts1 =  Typeface.createFromAsset(getAssets(),
                "fonts/OpenSans-Regular.ttf");
        fonts2 =  Typeface.createFromAsset(getAssets(),
                "fonts/OpenSans-Semibold.ttf");

        fonts3 =  Typeface.createFromAsset(getAssets(),
                "fonts/Roboto-Medium.ttf");

        fonts4 =  Typeface.createFromAsset(getAssets(),
                "fonts/Roboto-Regular.ttf");

        eshop.setTypeface(fonts1);
        searchtext.setTypeface(fonts1);
        shirt1.setTypeface(fonts4);
        jeans1.setTypeface(fonts4);
        shoes1.setTypeface(fonts4);
        slippers1.setTypeface(fonts4);
        goggles1.setTypeface(fonts4);
        groomingproducts.setTypeface(fonts2);
        trendingproducts.setTypeface(fonts2);
        topbrands.setTypeface(fonts2);

//*********RECYCLERVIEWS*********

        rv = (RecyclerView)findViewById(R.id.rv);
        rv2 = (RecyclerView)findViewById(R.id.rv2);
        rv3 = (RecyclerView)findViewById(R.id.rv3);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(mLayoutManager);

        RecyclerView.LayoutManager mLayoutManager1 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        rv2.setLayoutManager(mLayoutManager1);


        RecyclerView.LayoutManager mLayoutManager2 = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        rv3.setLayoutManager(mLayoutManager2);

        Bean = new ArrayList<BeanlistGrooming>();

        for (int i= 0; i< TITLEG.length; i++){

            BeanlistGrooming bean = new BeanlistGrooming(IMAGEG[i], TITLEG[i], DESCRIPTIONG[i], DATEG[i],DISCOUNTG[i], RATINGTEXTG[i]);
            Bean.add(bean);

        }

        baseAdapter = new GroomingRecyclerViewAdapter(this,Main2Activity.this, Bean) {
        };

        Bean1 = new ArrayList<BeanlistTrending>();

        for (int i= 0; i< TITLET.length; i++){

            BeanlistTrending bean1 = new BeanlistTrending(IMAGET[i], TITLET[i], DESCRIPTIONT[i], DATET[i],DISCOUNTT[i], RATINGTEXTT[i]);
            Bean1.add(bean1);

        }

        baseAdapter1 = new TrendingRecyclerViewAdapter(this,Main2Activity.this, Bean1) {
        };

        Bean2 = new ArrayList<BeanlistBrands>();

        for (int i= 0; i< IMAGEB.length; i++){

            BeanlistBrands bean2 = new BeanlistBrands(IMAGEB[i], TEXT1[i], TEXT2[i], TEXT3[i],TEXT4[i], TEXT5[i], TEXT6[i]);
            Bean2.add(bean2);

        }

        baseAdapter2 = new BrandsRecyclerViewAdapter(Main2Activity.this, Bean2) {
        };

        rv.setAdapter(baseAdapter);
        rv2.setAdapter(baseAdapter1);
        rv3.setAdapter(baseAdapter2);

        //         ********Slider*********
        mDemoSlider = (SliderLayout)findViewById(R.id.slider);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("1", R.drawable.shoppy_logo);
        file_maps.put("2",R.drawable.shoppy_logo);
        file_maps.put("3",R.drawable.shoppy_logo);


        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    //  .description(name)
                    .image(file_maps.get(name))

                    .setOnSliderClickListener(this);

            textSliderView.bundle(new Bundle());
            textSliderView.getBundle().putString("extra", name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Default);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new ChildAnimationExample());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer2_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        /*if (id == R.id.nav_home) {

        } else if (id == R.id.nav_win) {

        } else if (id == R.id.nav_build) {

        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_password) {

        } else if (id == R.id.nav_figures) {

        } else if (id == R.id.nav_abtcru) {

        } else if (id == R.id.nav_abtapp) {

        }else if (id == R.id.nav_settings) {

        }else if (id == R.id.nav_logout) {



        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer2_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }


    private void clickb(String s) {

        home.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        offer.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        fav.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        bag.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);
        noti.setColorFilter(getResources().getColor(R.color.boticon), android.graphics.PorterDuff.Mode.MULTIPLY);



        if(s.equalsIgnoreCase("1")) {

            home.setColorFilter(getResources().getColor(R.color.purpler), android.graphics.PorterDuff.Mode.MULTIPLY);

        }


        else if(s.equalsIgnoreCase("2")) {

            offer.setColorFilter(getResources().getColor(R.color.purpler), android.graphics.PorterDuff.Mode.MULTIPLY);

        }
        else if(s.equalsIgnoreCase("3")) {

            fav.setColorFilter(getResources().getColor(R.color.purpler), android.graphics.PorterDuff.Mode.MULTIPLY);

        }
        else if(s.equalsIgnoreCase("4")) {

            bag.setColorFilter(getResources().getColor(R.color.purpler), android.graphics.PorterDuff.Mode.MULTIPLY);

        }
        else if(s.equalsIgnoreCase("5")) {

            noti.setColorFilter(getResources().getColor(R.color.purpler), android.graphics.PorterDuff.Mode.MULTIPLY);

        }

    }

    @Override
    protected void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

}
