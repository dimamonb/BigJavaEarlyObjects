package ch08.pe_07;

public class Cube {
    private double height;

    public Cube(double height) {
        this.height = height;
    }

    public double cubeVolume() {
        return Math.pow(height, 3);
    }

    public double cubeSurface() {
        return 6 * Math.pow(height, 2);
    }
}
