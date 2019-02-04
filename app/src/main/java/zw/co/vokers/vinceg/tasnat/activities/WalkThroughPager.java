package zw.co.vokers.vinceg.tasnat.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.adapters.WalkthroughPagerAdapter;

/**
 * Created by Vince G on 10/1/2019
 */

public class WalkThroughPager extends AppCompatActivity {

    private View view;

    WalkThroughPager mFragmentPager;

    private Menu mMenu;

    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walkthrough_pager);

        viewPager = (ViewPager)findViewById(R.id.pager);
        final WalkthroughPagerAdapter adapter = new WalkthroughPagerAdapter
                (getSupportFragmentManager());
        viewPager.setAdapter(adapter);



    }


    public void setCurrentTab(int i) {
        viewPager.setCurrentItem(i);
    }



    @Override
    public void onBackPressed() {

        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

    }


}

