package ch09.pe_15.pe_14;

import java.awt.*;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int height, int width){
        super(x, y, width, height);
    }

    public double getPerimeter(){
        return getHeight() + getWidth();
    }

    public double getArea(){
        return getHeight() * getWidth();
    }
}
