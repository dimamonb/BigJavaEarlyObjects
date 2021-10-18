package ch08.pe_07;

import java.util.Scanner;

public class GeometryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius r=");
        double r = scanner.nextDouble();
        System.out.print("Enter height h=");
        double h = scanner.nextDouble();

        System.out.println("Cube volume: " + Geometry.cubeVolume(h));
        System.out.println("Cube surface: " + Geometry.cubeSurface(h));
        System.out.println("Sphere volume: " + Geometry.sphereVolume(r));
        System.out.println("Sphere surfase: " + Geometry.sphereSurface(r));
        System.out.println("Cylinder volume: " + Geometry.cylinderVolume(r, h));
        System.out.println("Cylinder surface: " + Geometry.cylinderSurface(r, h));
        System.out.println("Cone volume: " + Geometry.coneVolume(r, h));
        System.out.println("Cone surface: " + Geometry.coneSurface(r, h));

        System.out.println("************ Using classes ****************");

        Cube cube = new Cube(h);
        System.out.println("Cube volume in oop: " + cube.cubeVolume());
    }
}
