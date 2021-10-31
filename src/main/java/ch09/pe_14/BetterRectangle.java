package ch09.pe_14;

import java.awt.*;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height){
        setLocation(x, y);
        setSize(width, height);
    }

    public double getPerimeter(){
        return getHeight() + getWidth();
    }

    public double getArea(){
        return getHeight() * getWidth();
    }
}
