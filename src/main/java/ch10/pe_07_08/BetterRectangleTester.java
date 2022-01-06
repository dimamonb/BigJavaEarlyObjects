package ch10.pe_07_08;

public class BetterRectangleTester {

    public static void main(String[] args) {
        Measurer<BetterRectangle> measurer = new PerimeterMeasurer();
        BetterRectangle[] rects = new BetterRectangle[]
                {
                        new BetterRectangle(5, 10, 20, 30),
                        new BetterRectangle(10, 20, 30, 40),
                        new BetterRectangle(20, 30, 5, 15)
                };
        BetterRectangle largestPerimeter = (BetterRectangle) Data.largest(rects, measurer);
        System.out.println(largestPerimeter.getPerimeter());

    }
}
