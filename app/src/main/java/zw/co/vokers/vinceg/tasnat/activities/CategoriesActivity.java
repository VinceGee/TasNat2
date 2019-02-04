package zw.co.vokers.vinceg.tasnat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import zw.co.vokers.vinceg.tasnat.R;

/**
 * Created by Vince G on 11/1/2019
 */

public class CategoriesActivity extends AppCompatActivity {

    LinearLayout category1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        category1 = (LinearLayout) findViewById(R.id.cat1);


        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoriesActivity.this, ProductListActivity.class));
            }
        });

    }
}

