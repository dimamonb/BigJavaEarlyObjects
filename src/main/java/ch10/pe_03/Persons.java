package ch10.pe_03;

import ch10.pe_01.Measurable;

public class Persons implements Measurable {
    private double height;
    private String name;

    public Persons(double height, String name) {
        this.height = height;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return height;
    }
}
