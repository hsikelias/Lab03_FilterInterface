package interfaces;

import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister{
    public static void main(String[] args){

        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(1, 3));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(4, 2));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(6, 3));
        rectangles.add(new Rectangle(5, 5));

        Filter filter = new BigRectangleFilter();

        System.out.println("Rectangles with perimeter > 10:");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        for (Rectangle rectangle : rectangles){

            if (filter.accept(rectangle)){

                double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
                System.out.println("Width: " + rectangle.getWidth() + ", Height: " + rectangle.getHeight()
                        + ", Perimeter: " + perimeter
                );
            }
        }
    }
}