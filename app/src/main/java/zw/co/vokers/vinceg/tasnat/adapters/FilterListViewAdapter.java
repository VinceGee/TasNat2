package zw.co.vokers.vinceg.tasnat.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.models.ListBeanclass;

/**
 * Created by Vince G on 11/1/2019
 */

public class FilterListViewAdapter extends BaseAdapter {

    Context context;

    ArrayList<ListBeanclass> bean;

    LinearLayout linear1;
    TextView title;
    ImageView image;



    Typeface fonts1;





    public FilterListViewAdapter(Context context, ArrayList<ListBeanclass> bean) {


        this.context = context;
        this.bean = bean;
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

        fonts1 =  Typeface.createFromAsset(context.getAssets(),
                "fonts/MavenPro-Regular.ttf");

//        linear1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                clickb("1");
//
//            }
//        });

        ViewHolder viewHolder = null;

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.listview_filter,null);

            viewHolder = new ViewHolder();


            viewHolder.title = (TextView)convertView.findViewById(R.id.title);
            title = (TextView)convertView.findViewById(R.id.title);
            linear1 = (LinearLayout)convertView.findViewById(R.id.linear1);
            image = (ImageView)convertView.findViewById(R.id.image);

            viewHolder.title.setTypeface(fonts1);

            convertView.setTag(viewHolder);


        }else {

            viewHolder = (ViewHolder)convertView.getTag();
        }







        ListBeanclass bean = (ListBeanclass)getItem(position);


        viewHolder.title.setText(bean.getTitle());






        return convertView;
    }

//    private void clickb(String s) { image.setColorFilter(context.getResources().getColor(R.color.colorTex), android.graphics.PorterDuff.Mode.MULTIPLY);
//        title.setTextColor(Color.parseColor("#8a929d"));
//
//
//        if (s.equalsIgnoreCase("1")) {
//
//            image.setColorFilter(context.getResources().getColor(R.color.red), android.graphics.PorterDuff.Mode.MULTIPLY);
//            title.setTextColor(Color.parseColor("#ff5254"));
//        }
//
//
//    }

    private class ViewHolder{

        TextView title;











    }
}





