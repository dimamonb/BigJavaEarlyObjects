package ch10.pe_07_08;

public class PerimeterMeasurer implements Measurer<BetterRectangle> {
    @Override
    public double measure(BetterRectangle anObject) {
        return anObject.getPerimeter();
    }
}
