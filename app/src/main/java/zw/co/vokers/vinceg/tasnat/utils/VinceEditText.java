package zw.co.vokers.vinceg.tasnat.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Vince G on 10/1/2019
 */

public class VinceEditText extends EditText {

    public VinceEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public VinceEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VinceEditText(Context context) {
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
