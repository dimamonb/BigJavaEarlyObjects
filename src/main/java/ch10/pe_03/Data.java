package ch10.pe_03;

import ch10.pe_01.Measurable;


public class Data {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj: objects) {
            sum = sum + obj.getMeasure();
        }
        if(objects.length > 0){
            return sum / objects.length;
        } else {
            return  0;
        }
    }

    public static Measurable minimal(Measurable[] objects) {
        return Measurable.smallest(objects);
    }

    public static Measurable maximal(Measurable[] objects) {
        return Measurable.largest(objects);
    }
}
