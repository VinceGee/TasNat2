package zw.co.vokers.vinceg.tasnat.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import zw.co.vokers.vinceg.tasnat.fragments.WalkthrougOneFragment;
import zw.co.vokers.vinceg.tasnat.fragments.WalkthroughThreeFragment;
import zw.co.vokers.vinceg.tasnat.fragments.WalkthroughTwoFragment;

/**
 * Created by Vince G on 10/1/2019
 */

public class WalkthroughPagerAdapter extends FragmentStatePagerAdapter {



    public WalkthroughPagerAdapter(FragmentManager fm) {
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                WalkthrougOneFragment tab1 = new WalkthrougOneFragment();
                return tab1;
            case 1:
                WalkthroughTwoFragment tab2 = new WalkthroughTwoFragment();
                return tab2;


            case 2:
                WalkthroughThreeFragment tab3 = new WalkthroughThreeFragment();
                return tab3;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
