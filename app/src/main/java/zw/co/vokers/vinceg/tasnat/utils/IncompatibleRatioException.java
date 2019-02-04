package zw.co.vokers.vinceg.tasnat.utils;

/**
 * Created by Vince G on 10/1/2019
 */

public class IncompatibleRatioException extends RuntimeException {

    private static final long serialVersionUID = 234608108593115395L;

    public IncompatibleRatioException() {
        super("Can't perform Ken Burns effect on rects with distinct aspect ratios!");
    }
}