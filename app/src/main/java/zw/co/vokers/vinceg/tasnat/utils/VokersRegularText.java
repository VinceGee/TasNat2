package zw.co.vokers.vinceg.tasnat.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Vince G on 10/1/2019
 */

public class VokersRegularText extends TextView {

    public VokersRegularText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public VokersRegularText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VokersRegularText(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/MavenPro-Regular.ttf");
            setTypeface(tf);
        }
    }

}
