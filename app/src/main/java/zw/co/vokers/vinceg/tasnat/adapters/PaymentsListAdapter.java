package zw.co.vokers.vinceg.tasnat.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import zw.co.vokers.vinceg.tasnat.R;
import zw.co.vokers.vinceg.tasnat.models.DiscountBeanclass;
import zw.co.vokers.vinceg.tasnat.models.PaymentBeanClass;

/**
 * Created by Vince G on 12/1/2019
 */

public class PaymentsListAdapter extends BaseAdapter {

    Context context;

    ArrayList<PaymentBeanClass> bean1;

    TextView discounttext;
    Typeface fonts1;





    public PaymentsListAdapter(Context context, ArrayList<PaymentBeanClass> bean) {


        this.context = context;
        this.bean1 = bean;
    }




    @Override
    public int getCount() {
        return bean1.size();
    }

    @Override
    public Object getItem(int position) {
        return bean1.get(position);
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

        PaymentsListAdapter.ViewHolder viewHolder = null;

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.paymentslist,null);

            viewHolder = new PaymentsListAdapter.ViewHolder();

            viewHolder.paymenttext = (TextView)convertView.findViewById(R.id.paymenttext);

            viewHolder.paymenttext.setTypeface(fonts1);

            convertView.setTag(viewHolder);


        }else {

            viewHolder = (PaymentsListAdapter.ViewHolder)convertView.getTag();
        }







        PaymentBeanClass bean = (PaymentBeanClass)getItem(position);


        viewHolder.paymenttext.setText(bean.getPaymentText());






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

        TextView paymenttext;











    }
}






