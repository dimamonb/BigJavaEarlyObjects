package ch10.sec01;

import ch10.sec01.Measurable;

public class Country implements Measurable {

    private String name;
    private double area;

    /**
     Constructs a country.
     @param aName the name of the country
     @param anArea the area of the country
     */
    public Country(String aName, double anArea)
    {
        name = aName;
        area = anArea;
    }

    /**
     Gets the country name.
     @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     Gets the area of the country.
     @return the area
     */
    public double getArea()
    {
        return area;
    }

    @Override
    public double getMeasure() {
        return area;
    }
}
