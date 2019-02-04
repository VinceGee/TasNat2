package zw.co.vokers.vinceg.tasnat.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.models.GridBeanclass;

/**
 * Created by Vince G on 11/1/2019
 */

public class FilterGridviewAdapter extends BaseAdapter {

    Context context;

    ArrayList<GridBeanclass> bean;


    public FilterGridviewAdapter(Context context, ArrayList<GridBeanclass> bean) {
        this.bean = bean;
        this.context = context;
    }

    @Override
    public int getCount() {
        return bean.size();
    }

    @Override
    public Object getItem(int position) {
        return bean.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {




        ViewHolder viewHolder = null;

        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.gridview_filter, null);

            viewHolder = new ViewHolder();

            viewHolder.image1 = (ImageView) convertView.findViewById(R.id.image1);
            viewHolder.image2 = (ImageView) convertView.findViewById(R.id.image2);


            convertView.setTag(viewHolder);


        } else {

            viewHolder = (ViewHolder) convertView.getTag();
        }


        GridBeanclass bean = (GridBeanclass) getItem(position);

        viewHolder.image1.setImageResource(bean.getImage1());


        return convertView;
    }

    private class ViewHolder {
        ImageView image1;
        ImageView image2;

//        /        ***********img**********


//        image1.OnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                image2.setVisibility(View.VISIBLE);
//                image1.setVisibility(View.VISIBLE);
//
//            }
//        });
//
//        image2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                image2.setVisibility(View.GONE);
//                image1.setVisibility(View.VISIBLE);
//
//
//
//            }
//        });


    }
}
