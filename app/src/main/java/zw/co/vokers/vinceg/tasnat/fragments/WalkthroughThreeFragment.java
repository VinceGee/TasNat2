package zw.co.vokers.vinceg.tasnat.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.activities.SignIn;

/**
 * Created by Vince G on 10/1/2019
 */

public class WalkthroughThreeFragment extends Fragment {

    private LinearLayout next;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.walkthrough_3, container, false);


        next = (LinearLayout)rootView.findViewById(R.id.next);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(getActivity(), SignIn.class));

            }
        });

        return rootView;


    }




}

