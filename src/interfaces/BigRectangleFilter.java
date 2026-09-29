package interfaces;

import java.awt.Rectangle;

public class BigRectangleFilter implements Filter {
    @Override
    public boolean accept(Object x){
        Rectangle rectangle = (Rectangle) x;
        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        return perimeter > 10;
    }
}
