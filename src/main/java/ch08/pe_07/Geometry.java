package ch08.pe_07;

public class Geometry {

    public static double cubeVolume(double h) {
        return Math.pow(h, 3);
    }

    public static double cubeSurface(double h) {
        return 6 * Math.pow(h, 2);
    }

    public static double sphereVolume(double r) {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;
    }

    public static double sphereSurface(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2 * Math.PI * Math.pow(h, 2) + 2 * Math.PI * r * h;
    }

    public static double coneVolume(double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }

    public static double coneSurface(double r, double h) {
        double l = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        return Math.PI * Math.pow(r, 2) + Math.PI * r * h;
    }
}
