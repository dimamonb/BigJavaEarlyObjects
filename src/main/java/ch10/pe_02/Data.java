package ch10.pe_02;

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

    public static Measurable minimalScore(Measurable[] objects) {
        return Measurable.smallest(objects);
    }

    public static Measurable maxScore(Measurable[] objects) {
        return Measurable.largest(objects);
    }
}
