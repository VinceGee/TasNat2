package zw.co.vokers.vinceg.tasnat.utils;

import android.graphics.RectF;

/**
 * Created by Vince G on 10/1/2019
 */

public interface TransitionGenerator {
    public Transition generateNextTransition(RectF drawableBounds, RectF viewport);

}
