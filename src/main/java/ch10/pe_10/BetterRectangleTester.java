package ch10.pe_10;

public class BetterRectangleTester {
    static class PerimeterMeasurer implements Measurer<BetterRectangle> {
        @Override
        public double measure(BetterRectangle anObject) {
            return anObject.getPerimeter();
        }
    }
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
