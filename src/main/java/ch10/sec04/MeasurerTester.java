package ch10.sec04;

import java.awt.*;

public class MeasurerTester {
    public static void main(String[] args) {
        Measurer<Rectangle> areaMeas = new AreaMeasurer();
        Rectangle[] rects = new Rectangle[]
                {
                        new Rectangle(5, 10, 20, 30),
                        new Rectangle(10, 20, 30, 40),
                        new Rectangle(20, 30, 5, 15)
                };
        double averageArea = Data.average(rects, areaMeas);
        System.out.println("Average area: " + averageArea);
        System.out.println("Expected: 625");
    }
}

