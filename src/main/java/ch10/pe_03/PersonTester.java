package ch10.pe_03;

import ch10.pe_01.Measurable;

public class PersonTester {
    public static void main(String[] args) {
        Measurable[] persons = new Measurable[] {
                new Persons(180, "Mike"),
                new Persons(174, "Jane"),
                new Persons(160, "Lena"),
                new Persons(192, "Jordan")
        };

        double averageHeight = Data.average(persons);
        Persons highestPerson = (Persons)Data.maximal(persons);
        System.out.println("Average height: " + averageHeight);
        System.out.println("Highest: " + highestPerson.getHeight() + "\nName: " + highestPerson.getName());
    }
}
