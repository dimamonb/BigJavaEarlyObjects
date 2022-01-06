package ch10.sec04;

import java.awt.*;

public class AreaMeasurer implements Measurer<Rectangle>{
    @Override
    public double measure(Rectangle anObject) {
        //Rectangle aRectangle = (Rectangle) anObject;
        double area = anObject.getWidth() * anObject.getHeight();
        return area;
    }
}
